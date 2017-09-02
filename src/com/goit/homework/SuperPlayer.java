package com.goit.homework;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public abstract class SuperPlayer {
    final int cost;

    public SuperPlayer(int cost) {
        this.cost = cost;
    }

    public void LookCost() {
        System.out.println(this.cost);
    }

    public int GetCost() {
        return this.cost;
    }

    public void playAllSongs(String[] songs) {
        for (String song : songs) {
            System.out.println(song);
        }
    }

    public String AllSongsToString(String[] songs) {
        StringBuilder builder = new StringBuilder();
        for (String s : songs) {
            builder.append(s + " ");
        }
        String str = builder.toString();
        return str;
    }

    public void playSong(String song) {
        System.out.println("Now playing : " + song);
    }

    public String GiveSong(String song) {
        String tmp = "Now playing : " + song;
        return tmp;
    }

    public Label CreateLabel(double x, double y, String text) {

        Label label = new Label();
        label.setTranslateX(x);
        label.setTranslateY(y);
        label.setText(text);

        return label;
    }


    public void start(
            Stage stage,

            boolean btn_nomber_2,
            Label label_for_btn2,
            String text_for_btn2,

            boolean btn_nomber_3,
            Label label_for_btn3,
            String text_for_btn3,

            boolean btn_nomber_4,
            Label label_for_btn4,
            String text_for_btn4
    ) {

        Pane root = new Pane();

        Button btn1 = new Button();
        btn1.setTranslateX(40);
        btn1.setTranslateY(40);
        btn1.setOnAction(event -> {
            root.getChildren().add(CreateLabel(50, 200, "Стоимость :" + Integer.toString(GetCost())));
        });
        root.getChildren().addAll(
                CreateLabel(60, btn1.getTranslateY(), "Отобразить стоимость"),
                btn1
        );


        if (btn_nomber_2 == true) {
            Button btn2 = new Button();
            btn2.setTranslateX(40);
            btn2.setTranslateY(80);
            btn2.setOnAction(event -> {
                root.getChildren().add(label_for_btn2);
            });
            root.getChildren().addAll(
                    CreateLabel(60, btn2.getTranslateY(), text_for_btn2),
                    btn2
            );
        }

        if (btn_nomber_3 == true) {
            Button btn3 = new Button();
            btn3.setTranslateX(40);
            btn3.setTranslateY(120);
            btn3.setOnAction(event -> {
                root.getChildren().add(label_for_btn3);
            });
            root.getChildren().addAll(
                    CreateLabel(60, btn3.getTranslateY(), text_for_btn3),
                    btn3
            );
        }

        if (btn_nomber_4 == true) {
            Button btn4 = new Button();
            btn4.setTranslateX(40);
            btn4.setTranslateY(160);
            btn4.setOnAction(event -> {
                root.getChildren().add(label_for_btn4);
            });
            root.getChildren().addAll(
                    CreateLabel(60, btn4.getTranslateY(), text_for_btn4),
                    btn4
            );
        }

        stage.setScene(new Scene(root, 300, 300));
        stage.show();
    }


}
