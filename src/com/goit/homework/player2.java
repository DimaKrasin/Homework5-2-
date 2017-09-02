package com.goit.homework;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class player2 extends SuperPlayer {

    public player2(final int cost) {
        super(cost);

    }

    public void show(Stage stage, String song, String[] songs) {
        super.start(stage,
                true,
                CreateLabel(50, 220,"Error"),
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

