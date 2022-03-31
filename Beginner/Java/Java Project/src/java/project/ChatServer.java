/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 

import javafx.application.Application;
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
    Label Label1 = new Label();
    Label Label2 = new Label();
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
        Scene scene = new Scene(BPane, 300, 250);
        
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
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void handle(ActionEvent action)
    {
        if(action.getSource() == SBtn)
        {
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
