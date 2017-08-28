package com.goit.homework;

import javafx.scene.control.Label;


public abstract class SuperPlayer {
    final int cost;

    public SuperPlayer(int cost){
        this.cost = cost;
    }

    public	void LookCost(){
        System.out.println(this.cost);
    }

    public	int GetCost(){return this.cost; }

    public void playAllSongs(String[] songs){
        for(String song : songs){
            System.out.println(song);
        }
    }

    public String AllSongsToString(String[] songs){
        StringBuilder builder = new StringBuilder();
        for(String s : songs) {
            builder.append(s+" ");
        }
        String str = builder.toString();
        return str;
    }

    public void playSong(String song){
        System.out.println("Now playing : "+song);
    }

    public String GiveSong(String song){
        String tmp =  "Now playing : "+song;
        return tmp;
    }

    public Label CreateLabel(double x, double y, String text){

        Label label = new Label();
        label.setTranslateX(x);
        label.setTranslateY(y);
        label.setText(text);

        return label;
    }
}
