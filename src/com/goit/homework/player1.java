package com.goit.homework;

import javafx.stage.Stage;

public class player1 extends SuperPlayer {

    public player1(final int cost) {
        super(cost);
    }

    public void show(Stage stage, String song, String[] songs) {
        super.start(stage,
                true,
                CreateLabel(50, 220, GiveSong(song)),
                "Проиграть песню",

                false,
                CreateLabel(50, 240,""),
                "",

                false,
                CreateLabel(50, 260,""),
                ""


        );
    }

}
