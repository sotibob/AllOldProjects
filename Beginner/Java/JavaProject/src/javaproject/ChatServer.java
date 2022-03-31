/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Sotonte Bob-manuel
 */
public class ChatServer extends Application implements EventHandler<ActionEvent>{
    
    Button SBtn = new Button("Send");
    TextField Field1 = new TextField();
    Label Label1 = new Label("Chat Server");
    Label Label2 = new Label("Text goes here");
    
    @Override
    public void start(Stage primaryStage) {
        SBtn.setOnAction(this);
        
        FlowPane FPane1 = new FlowPane();
        FPane1.getChildren().add(Label1);
        
        FlowPane FPane2 = new FlowPane();
        FPane2.getChildren().add(Label2);
        
        GridPane GPane = new GridPane();
        GPane.add(Field1, 0, 0);
        GPane.add(SBtn, 1, 0);
        
        BorderPane BPane = new BorderPane();
        Scene scene = new Scene(BPane, 235, 250);
        
        SBtn.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white;");
        Label1.setStyle("-fx-font: normal bold 20px 'serif' "); 
        BPane.setPadding(new Insets(10));
        BPane.setStyle("-fx-background-color: BEIGE; ");
        BPane.setTop(FPane1);
        BPane.setCenter(FPane2);
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
        if(action.getSource() == SBtn)
        {
            String text = Field1.getText();
            ChatServerData csd1 = new ChatServerData(text);
            csd1.start();
            ChatServerData csd2 = new ChatServerData();
            csd2.start();
            while(csd2.getStrl() == "")
            {
                System.out.println("Waiting...");
            }
            Label2.setText(csd1.getStrl());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
