package com.flo.snakePlus;

import javafx.application.Application;
import javafx.stage.Stage;

public class MasterFrame extends Application{

    MainGameFrame game;

    public void start(Stage primaryStage) throws Exception {

        game = new MainGameFrame();
        game.start(primaryStage);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
