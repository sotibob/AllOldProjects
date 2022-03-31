package javaproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Sotonte Bob-manuel
 */
public class ChatClient extends Application implements EventHandler<ActionEvent>{
    
    Button SBtn2 = new Button("Send");
    TextField Field2 = new TextField();
    Label Label3 = new Label("Chat Client");
    Label Label4 = new Label("Text goes here");
    
    @Override
    public void start(Stage primaryStage) {
        SBtn2.setOnAction(this);
        
        FlowPane FPane1 = new FlowPane();
        FPane1.getChildren().add(Label3);
        
        FlowPane FPane2 = new FlowPane();
        FPane2.getChildren().add(Label4);
        
        GridPane GPane = new GridPane();
        GPane.add(Field2, 0, 0);
        GPane.add(SBtn2, 1, 0);
        
        BorderPane BPane = new BorderPane();
        Scene scene = new Scene(BPane, 235, 250);
        
        SBtn2.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white;");
        Label3.setStyle("-fx-font: normal bold 20px 'serif' "); 
        BPane.setPadding(new Insets(10));
        BPane.setStyle("-fx-background-color: BEIGE; ");
        BPane.setTop(FPane1);
        BPane.setLeft(FPane2);
        BPane.setBottom(GPane);
        GPane.setPadding(new Insets(5));
        GPane.setVgap(5);
        GPane.setHgap(5);
        FPane2.setPadding(new Insets(10));
        FPane1.setPadding(new Insets(0, 0, 10, 45));
        
        primaryStage.setTitle("Messenger");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void handle(ActionEvent action)
    {
        if(action.getSource() == SBtn2)
        {
            String text = Field2.getText();
            ChatClientData ccd1 = new ChatClientData(text);
            ccd1.start();
            ChatClientData ccd2 = new ChatClientData();
            ccd2.start();
            while(ccd2.getStrl() == "")
            {
                System.out.println("Waiting...");
            }
            Label4.setText(ccd1.getStrl());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
