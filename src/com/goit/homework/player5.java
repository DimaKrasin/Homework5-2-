package com.goit.homework;

import javafx.stage.Stage;

public class player5 extends SuperPlayer {

    public	player5(final int cost){
        super(cost);
    }

    public String GiveAllRaverse(String[] songs){

        String[] tmp = new String[songs.length];
        StringBuilder builder = new StringBuilder();

        for(int i = 0;i<songs.length;i++){
            tmp[i]=(songs[songs.length-(i+1)].toString());
        }

        for(String s : tmp) {
            builder.append(s+" ");
        }
        String str = builder.toString();

        return str;
    }

    public void show(Stage stage, String song, String[] songs) {
        super.start(stage,
                true,
                CreateLabel(50, 220, songs[0].toString()),
                "Проиграть первую песню",

                true,
                CreateLabel(50, 240,GiveAllRaverse(songs)),
                "Проиграть плейлист наоборот",

                false,
                CreateLabel(50, 260,""),
                ""


        );
    }
}