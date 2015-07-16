package com.flo.snakePlus;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Florian on 16.07.2015.
 */

public class Tile extends StackPane {

//    Player owner;

    int state = 0;

//    Coordinate location;

    Rectangle rc = new Rectangle();

    public Tile() {

//        location = coord;

        int size = 30;

        rc.setHeight(size);
        rc.setWidth(size);
        rc.setFill(Color.WHITE);
        rc.setStroke(Color.BLACK);
        rc.setStrokeWidth(2);

//        setTranslateX(xCoord * size);
//        setTranslateY(yCoord * size);

        getChildren().addAll(rc);
    }

    public void switchState() {
        if (state == 1) {
            state = 0;
            rc.setFill(Color.WHITE);
        } else {
            state = 1;
            rc.setFill(Color.BLACK);
        }
    }

    public void setEatable() {
        state = 2;
        rc.setFill(Color.GREY);
    }

    public boolean isEatable() {
        if (state == 2) {
            return true;
        } else return false;
    }

    public boolean isFree() {
        if (state == 0) {
            return true;
        } else return false;
    }
}
