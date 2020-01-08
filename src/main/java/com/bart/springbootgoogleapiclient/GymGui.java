package com.bart.springbootgoogleapiclient;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import com.bart.springbootgoogleapiclient.model.Result;

@Route
public class GymGui extends VerticalLayout {

    @Autowired
    public GymGui(GoogleApiClient googleApiClient) {
        Grid<Result> grid = new Grid<>(Result.class);
        grid.setItems(googleApiClient.getResult());
        add(grid);
    }


}
