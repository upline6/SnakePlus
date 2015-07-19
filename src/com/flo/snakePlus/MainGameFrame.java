package com.flo.snakePlus;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainGameFrame {

    private TileGrid field;
//    private Snake s1;
    private GameMenu gameMenu;

    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();
        root.setPrefSize(602, 602);

        field = new TileGrid(10, 8);
//        s1 = new Snake();

        gameMenu = new GameMenu();
        gameMenu.setVisible(false);

//        s1.addElement(1, 1);
//        s1.move(KeyCode.DOWN);
//        s1.addElement(new Coordinate(1, 3));
//        s1.addElement(new Coordinate(1, 4));

        root.getChildren().addAll(field/*, s1*/, gameMenu);

        Scene scene = new Scene(root);
//        scene.setOnKeyPressed(event -> s1.setNextDirection(event.getCode()));

//        Timeline run = new Timeline(
//                new KeyFrame(Duration.millis(500), event -> s1.move(s1.getNextDirection()))
//        );
//        run.setCycleCount(Animation.INDEFINITE);
//        run.play();

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

        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake+");
        primaryStage.show();
    }

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

}
