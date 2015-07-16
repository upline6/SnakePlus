package com.flo.snakePlus;

import javafx.scene.Group;
import javafx.scene.layout.StackPane;

import java.util.Random;

public class TileGrid extends StackPane {

    private int size = 30;
    private Tile[][] tiles = new Tile[20][20];


    public TileGrid() {

        Group group = new Group();

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                Tile t = new Tile();
                t.setTranslateX(i * size);
                t.setTranslateY(j * size);
                group.getChildren().add(t);
                tiles[i][j] = t;
            }
        }


        tiles[6][8].setEatable();

        getChildren().addAll(group);
    }

    public Tile getTile(int x, int y) {
        return tiles[x][y];
    }

    public int getSize() {
        return size;
    }

    public void addSnack() {
        Random random = new Random();
        int randomX = random.nextInt(19);
        int randomY = random.nextInt(19);
        if (tiles[randomX][randomY].isFree()) {
            tiles[randomX][randomY].setEatable();
        } else addSnack();
    }

    public Tile getNorth(int x, int y) {
        return tiles[x][y - 1];
    }

    public Tile getSouth(int x, int y) {
        return tiles[x][y + 1];
    }
}