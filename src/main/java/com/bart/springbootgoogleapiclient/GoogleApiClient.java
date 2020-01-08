package com.bart.springbootgoogleapiclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bart.springbootgoogleapiclient.model.GooglePlace;
import com.bart.springbootgoogleapiclient.model.Result;

import java.util.List;

@Service
public class GoogleApiClient {

    public List<Result> getResult() {
        RestTemplate restTemplate = new RestTemplate();
        String key = "";
        ResponseEntity<GooglePlace> exchange = restTemplate.exchange("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=52.4069200,16.9299300&radius=450&types=gym&key=" + key,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                GooglePlace.class
        );
        return exchange.getBody().getResults();
    }
}
