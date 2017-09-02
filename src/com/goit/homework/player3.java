package com.goit.homework;

import javafx.stage.Stage;

public class player3 extends SuperPlayer {

    public	player3(final int cost){
        super(cost);

    }

    public void show(Stage stage, String song, String[] songs) {
        super.start(stage,
                true,
                CreateLabel(50, 220, songs[0].toString()),
                "Проиграть первую песню",

                true,
                CreateLabel(50, 240,AllSongsToString(songs)),
                "Проиграть плейлист",

                false,
                CreateLabel(50, 260,""),
                ""


        );
    }
}
