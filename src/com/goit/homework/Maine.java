package com.goit.homework;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Maine extends Application{

    String song = "Na-na-na-na-na-na";

    String[] songs = new String[]{"Despasito","Wolfenstein","Brutto"};

    public static void main(String args[]){
        launch();
    }

    public void start(Stage myStage){

        myStage.setTitle("List");
        Pane rootNode = new Pane();
        Scene myScene = new Scene(rootNode, 300, 300);

        Label response  = new Label("Выберите плеэр");
        response.setTranslateX(90);
        response.setTranslateY(60);

        ObservableList<String> PlayerTypes = FXCollections.observableArrayList
                ("player1","player2","player3","player4","player5","player6");

        ListView<String> PlayersList = new ListView<>(PlayerTypes);

        PlayersList.setPrefSize(70,  150);
        PlayersList.setTranslateX(100);
        PlayersList.setTranslateY(80);

        MultipleSelectionModel<String> PlayerSelModel = PlayersList.getSelectionModel();
        PlayerSelModel.setSelectionMode(SelectionMode. SINGLE);

        PlayerSelModel.selectedItemProperty().addListener(
                new ChangeListener<String>() {

                    public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal){
                        response.setText("Вы выбрали " + newVal);

                        switch(newVal){
                            case "player1":
                                player1 player1 = new player1(1);
                                player1.show(myStage,song);
                                break;
                            case "player2":
                                player2 player2 = new player2(2);
                                player2.show(myStage,song,songs);
                                break;
                            case "player3":
                                player3 player3 = new player3(3);
                                player3.show(myStage,song,songs);
                                break;
                            case "player4":
                                player4 player4 = new player4(4);
                                player4.show(myStage,song,songs);
                                break;
                            case "player5":
                                player5 player5 = new player5(5);
                                player5.show(myStage,song,songs);
                                break;
                            case "player6":
                                player6 player6 = new player6(6);
                                player6.show(myStage,song,songs);
                                break;
                        }
                    }

                });

        rootNode.getChildren().addAll(PlayersList,response);

        myStage.setScene(myScene);

        myStage.show();
    }
}



