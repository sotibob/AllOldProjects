/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.buttons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/***********************
 *Sotonte Bob-manuel
 *Lab #1
 ***********************/
//Implement EventHandler<Action Event>
public class Buttons extends Application implements EventHandler<ActionEvent>
{
//Create your Global Buttons
    Button EBtn = new Button("Exit");
    Button CBtn = new Button("Close");
    Button OBtn = new Button("Open");
    @Override
    public void start(Stage primaryStage)
    {
        //Clear the default Button and set the new ones on action
        EBtn.setOnAction(this);
        CBtn.setOnAction(this);
        OBtn.setOnAction(this);
	
	//Change StackPane to Flow Pane and add your new Buttons to it
	//Import Flowpane for use
        FlowPane fPane = new FlowPane();
        fPane.getChildren().add(EBtn);
        fPane.getChildren().add(CBtn);
        fPane.getChildren().add(OBtn);
        
        Scene scene = new Scene(fPane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	//Create a method called handle for the Action Events
    public void handle(ActionEvent action)
    {
	//Use if statements to know what button is clicked and  what action to take
        if(action.getSource() == EBtn)
        {
           System.out.println("You Clicked on the Exit Button");
        }
        else if(action.getSource() == CBtn)
        {
            System.out.println("You Clicked on the Close Button");
        }
        else if(action.getSource() == OBtn)
        {
            System.out.println("You Clicked on the Open Button");
        }
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
