package com.flo.snakePlus;

import javafx.scene.Group;
import javafx.scene.layout.StackPane;

public class TileGrid extends StackPane {

    private int size = 30;
    public Tile[][] tiles;

    public TileGrid(int xRows, int yRows) {

        tiles = new Tile[xRows][yRows];

        Group group = new Group();

        for (int i = 0; i < xRows; i++) {
            for (int j = 0; j < yRows; j++) {
                Tile t = new Tile(new Coordinate(i, j));
                group.getChildren().add(t);
                tiles[i][j] = t;
            }
        }
        getChildren().addAll(group);
    }

    public Tile getTile(Coordinate coord) {
        return tiles[coord.getX()][coord.getY()];
    }
}