package com.flo.snakePlus;

import javafx.animation.*;
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
            closeMenu();
        });

        MenuButton bntExit = new MenuButton("EXIT");
        bntExit.setOnMouseClicked(event -> {
            System.exit(0);
        });

        TextField title = new TextField("Menu");
        title.setScaleX(3);
        title.setScaleY(3);

        menu0.getChildren().addAll(title, bntResume, bntExit);

        Rectangle rc = new Rectangle(1152, 648);
        rc.setOpacity(0.9);
        rc.setFill(Color.GRAY);

        getChildren().addAll(rc, menu0);
    }

    public void openMenu() {
        FadeTransition ft = new FadeTransition(Duration.seconds(0.5), this);
        ft.setFromValue(0);
        ft.setToValue(1);
        this.setVisible(true);
        ft.play();
    }

    public void closeMenu() {
        FadeTransition ft = new FadeTransition(Duration.seconds(0.5), this);
        ft.setFromValue(1);
        ft.setToValue(0);
        ft.setOnFinished(event1 -> this.setVisible(false));
        ft.play();
    }

    public void toggleMenu() {
        if (!this.isVisible()) {
            openMenu();
        } else {
            closeMenu();
        }
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
                TranslateTransition tt = new TranslateTransition();
                tt.setNode(rc);
                tt.setDuration(Duration.millis(200));
                tt.setToX(20);
                TranslateTransition tt2 = new TranslateTransition();
                tt2.setNode(text);
                tt2.setDuration(Duration.millis(200));
                tt2.setToX(30);
                tt.play();
                tt2.play();
                rc.setFill(Color.WHITE);
                text.setFill(Color.BLACK);
            });

            setOnMouseExited(event -> {
                TranslateTransition tt = new TranslateTransition();
                tt.setNode(rc);
                tt.setDuration(Duration.millis(200));
                tt.setToX(0);
                TranslateTransition tt2 = new TranslateTransition();
                tt2.setNode(text);
                tt2.setDuration(Duration.millis(200));
                tt2.setToX(10);
                tt.play();
                tt2.play();
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