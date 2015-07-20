package com.flo.snakePlus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainGameFrame extends Application {

    private GameMenu gameMenu;
    public static TileGrid field;
    private Snake s1;

    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();
        root.setPrefSize(602, 602);

        gameMenu = new GameMenu();
        field = new TileGrid(20, 20);
        s1 = new Snake();

        gameMenu.setVisible(false);

        Scene scene = new Scene(root);

        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                gameMenu.toggleMenu();
            }
        });
//        scene.setOnMouseReleased(event1 -> field.getTile(new Coordinate(3, 5)).posessed());

        root.getChildren().addAll(field, gameMenu);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake+");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//        s1.addElement(1, 1);
//        s1.move(KeyCode.DOWN);
//        s1.addElement(new Coordinate(1, 3));
//        s1.addElement(new Coordinate(1, 4));


//        scene.setOnKeyPressed(event -> s1.setNextDirection(event.getCode()));

//        Timeline run = new Timeline(
//                new KeyFrame(Duration.millis(500), event -> s1.move(s1.getNextDirection()))
//        );
//        run.setCycleCount(Animation.INDEFINITE);
//        run.play();
//        s1.claimTile();
//        scene.setOnKeyPressed(event -> s1.claimTile());

//        scene.setOnKeyPressed(event -> {
//            s1.setNextDirection(event.getCode());
////            s1.move(s1.getNextDirection());
//            if (event.getCode() == KeyCode.ESCAPE) {
//                if (!gameMenu.isVisible()) {
////                    run.pause();
//                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
//                    ft.setFromValue(0);
//                    ft.setToValue(1);
//
//                    gameMenu.setVisible(true);
//                    ft.play();
//                } else {
//                    FadeTransition ft = new FadeTransition(Duration.seconds(0.5), gameMenu);
//                    ft.setFromValue(1);
//                    ft.setToValue(0);
//                    ft.setOnFinished(event1 -> gameMenu.setVisible(false));
//                    ft.play();
////                    run.play();
//                }
//            }
//        });

//    }

//    public static void main(String[] args) {
//        launch(args);
//    }

//    private void run(){
//        Timeline run = new Timeline(
//                new KeyFrame(Duration.millis(500), event -> s1.move(s1.getNextDirection()))
//        );
//        run.pause();
//        run.setCycleCount(Animation.INDEFINITE);
//        run.play();
//    }


