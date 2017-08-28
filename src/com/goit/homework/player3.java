package com.goit.homework;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class player3 extends SuperPlayer {

    ////////////////////////constructor///////////////

    public	player3(final int cost){
        super(cost);

    }

    ////////////////////metods//////////////////

    public void playFirstSong(String[] songs){
        System.out.println(songs[0].toString());
    }

    ///////////////////////java_fx///////////////////////////

    public void show(Stage stage, String song, String[] songs){
        start(stage,song,songs);
    }

    public void start(Stage stage,String song,String[] songs) {

        Pane root = new Pane();

        Button btn1 = new Button();
        btn1.setTranslateX(40);
        btn1.setTranslateY(40);
        btn1.setOnAction(event -> {
            root.getChildren().add(CreateLabel(50,200,"Стоимость :" + Integer.toString(GetCost())));
        });

        Button btn2 = new Button();
        btn2.setTranslateX(40);
        btn2.setTranslateY(80);
        btn2.setOnAction(event -> {
            root.getChildren().add(CreateLabel(50,220,GiveSong(song)));
        });

        Button btn3 = new Button();
        btn3.setTranslateX(40);
        btn3.setTranslateY(120);
        btn3.setOnAction(event -> {
            root.getChildren().add(CreateLabel(50,240,AllSongsToString(songs)));
        });

        Button btn4 = new Button();
        btn4.setTranslateX(40);
        btn4.setTranslateY(160);
        btn4.setOnAction(event -> {
            root.getChildren().add(CreateLabel(50,260,songs[0].toString()));
        });

        root.getChildren().addAll(
                CreateLabel(60,btn1.getTranslateY(),"Отобразить стоимость"),
                CreateLabel(60,btn2.getTranslateY(),"Проиграть песню"),
                CreateLabel(60,btn3.getTranslateY(),"Проиграть все песни"),
                CreateLabel(60,btn4.getTranslateY(),"Проиграть первую песню"),
                btn1,
                btn2,
                btn3,
                btn4
        );

        stage.setScene(new Scene(root,300,300));
        stage.show();
    }
}
