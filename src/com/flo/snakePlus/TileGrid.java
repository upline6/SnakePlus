package com.flo.snakePlus;

import javafx.scene.Group;
import javafx.scene.layout.StackPane;

public class TileGrid extends StackPane {

    private int size = 30;
    private Tile[] tiles;

    public TileGrid(int xRows, int yRows) {

        tiles = new Tile[xRows * yRows];

        Group group = new Group();

        for (int i = 0; i < xRows; i++) {
            for (int j = 0; j < yRows; j++) {
                Tile t = new Tile(new Coordinate(i, j));
                group.getChildren().add(t);
                int f = 0;
                tiles[f] = t;
                f++;
            }
        }
        getChildren().addAll(group);
    }
}