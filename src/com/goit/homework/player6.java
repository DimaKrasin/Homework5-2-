package com.goit.homework;

import javafx.stage.Stage;

public class player6 extends SuperPlayer {

    public	player6(final int cost){
        super(cost);
    }

    public static int rnd(int max) {
        return (int) (Math.random() * ++max); }

    public String GiveShuffle(String[] songs){

        String[] tmp = new String[songs.length];
        StringBuilder builder = new StringBuilder();

        for(int i = 0;i<songs.length;i++){ tmp[i] = songs[rnd(songs.length-1)]; }

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
                CreateLabel(50, 240,AllSongsToString(songs)),
                "Проиграть плейлист",

                true,
                CreateLabel(50, 260,GiveShuffle(songs)),
                "Перемашаь плейлист"


        );
    }

}
