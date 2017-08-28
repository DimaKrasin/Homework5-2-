package com.goit.homework;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class player1 extends SuperPlayer {

    ////////////////////////constructor////////////////

    public player1(final int cost) { super(cost); }

    ///////////////////////consol_methods//////////////

    public void show(Stage stage,String song){
        start(stage,song);
    }

    public void start(Stage stage,String song) {

        Pane root = new Pane();

        Button btn1 = new Button();
        btn1.setTranslateX(40);
        btn1.setTranslateY(40);
        btn1.setOnAction(event1 -> {
            root.getChildren().add(CreateLabel(50,120,"Стоимость :" + Integer.toString(GetCost())));
        });

        Button btn2 = new Button();
        btn2.setTranslateX(40);
        btn2.setTranslateY(80);
        btn2.setOnAction(event2 -> {
            root.getChildren().add(CreateLabel(50,160,GiveSong(song)));
        });

        root.getChildren().addAll(
                CreateLabel(60,btn1.getTranslateY(),"Отобразить стоимость"),
                CreateLabel(60,btn2.getTranslateY(),"Проиграть песню"),
                btn1,
                btn2
        );

        stage.setScene(new Scene(root,300,300));
        stage.show();
    }



}
