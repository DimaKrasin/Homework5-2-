package com.goit.homework;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class player2 extends SuperPlayer {

    //////////////////constructor//////////////////

    public	player2(final int cost){
        super(cost);

    }

    /////////////////metods/////////////////

    public void playSong(String song){ System.out.println(" Error "); }

    ////////////////java_fx/////////////////////////

    public void show(Stage stage, String song,String[] songs){
        start(stage,song,songs);
    }

    public void start(Stage stage,String song,String[] songs) {

        Pane root = new Pane();

        Button btn1 = new Button();
        btn1.setTranslateX(40);
        btn1.setTranslateY(40);
        btn1.setOnAction(event -> {
            root.getChildren().add(CreateLabel(50,160,"Стоимость :" + Integer.toString(GetCost())));
        });

        Button btn2 = new Button();
        btn2.setTranslateX(40);
        btn2.setTranslateY(80);
        btn2.setOnAction(event -> {
            root.getChildren().add(CreateLabel(50,180,"Error"));
        });

        Button btn3 = new Button();
        btn3.setTranslateX(40);
        btn3.setTranslateY(120);
        btn3.setOnAction(event -> {
            root.getChildren().add(CreateLabel(50,200,AllSongsToString(songs)));
        });

        root.getChildren().addAll(
                CreateLabel(60,btn1.getTranslateY(),"Отобразить стоимость"),
                CreateLabel(60,btn2.getTranslateY(),"Проиграть песню"),
                CreateLabel(60,btn3.getTranslateY(),"Проиграть все песни"),
                btn1,
                btn2,
                btn3
        );

        stage.setScene(new Scene(root,300,300));
        stage.show();
    }
}

