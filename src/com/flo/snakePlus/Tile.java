package com.flo.snakePlus;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends StackPane {

//    Player owner;

    Coordinate location;

    Rectangle rc = new Rectangle();

    public Tile(Coordinate coord) {

        location = coord;

        int size = 30;

        rc.setHeight(size);
        rc.setWidth(size);
        rc.setFill(Color.WHITE);
        rc.setStroke(Color.BLACK);
        rc.setStrokeWidth(2);
        setTranslateX(coord.getX() * size);
        setTranslateY(coord.getY() * size);

        getChildren().addAll(rc);
    }
}
