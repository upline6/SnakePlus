package com.flo.snakePlus;

import javafx.animation.FadeTransition;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class GameMenu extends Parent {

    public GameMenu() {

        VBox menu0 = new VBox(10);

        menu0.setTranslateX(100);
        menu0.setTranslateY(200);

        MenuButton bntResume = new MenuButton("RESUME");
        bntResume.setOnMouseClicked(event -> {
            FadeTransition ft = new FadeTransition(Duration.seconds(0.5), this);
            ft.setFromValue(1);
            ft.setToValue(0);
            ft.setOnFinished(event1 -> this.setVisible(false));
            ft.play();
        });

        MenuButton bntExit = new MenuButton("EXIT");
        bntExit.setOnMouseClicked(event -> {
            System.exit(0);
        });

        TextField title = new TextField("Menu");

        menu0.getChildren().addAll(title, bntResume, bntExit);

        Rectangle rc = new Rectangle(1152, 648);
        rc.setOpacity(0.4);
        rc.setFill(Color.GRAY);

        getChildren().addAll(rc, menu0);
    }

    private static class MenuButton extends StackPane {

        private Text text;

        public MenuButton(String name) {
            text = new Text(name);
            text.setFill(Color.WHITE);
            text.setTranslateX(10);

            Rectangle rc = new Rectangle(250, 30);
            rc.setOpacity(0.5);
            rc.setFill(Color.BLACK);
            rc.setEffect(new GaussianBlur(3.5));

            setAlignment(Pos.CENTER_LEFT);
            setRotate(0);
            getChildren().addAll(rc, text);

            setOnMouseEntered(event -> {
                rc.setTranslateX(20);
                text.setTranslateX(30);
                rc.setFill(Color.WHITE);
                text.setFill(Color.BLACK);
            });

            setOnMouseExited(event -> {
                rc.setTranslateX(0);
                text.setTranslateX(10);
                rc.setFill(Color.BLACK);
                text.setFill(Color.WHITE);
            });

            DropShadow drop = new DropShadow(50, Color.WHITE);
            drop.setInput(new Glow());

            setOnMousePressed(event -> setEffect(drop));
            setOnMouseReleased(event -> setEffect(null));

        }
    }

    private static class TextField extends StackPane {

        private Text text;

        public TextField(String content) {
            text = new Text(content);
            text.setFill(Color.WHITE);

            getChildren().addAll(text);
        }
    }
}