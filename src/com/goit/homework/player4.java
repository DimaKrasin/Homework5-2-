package com.goit.homework;

import javafx.stage.Stage;

public class player4 extends SuperPlayer {

    public	player4(final int cost){
        super(cost);

    }

    public void show(Stage stage, String song, String[] songs) {
        super.start(stage,
                true,
                CreateLabel(50, 220, songs[songs.length-1].toString()),
                "Проиграть последнюю песню",

                true,
                CreateLabel(50, 240,AllSongsToString(songs)),
                "Проиграть плейлист",

                false,
                CreateLabel(50, 260,""),
                ""


        );
    }
}
