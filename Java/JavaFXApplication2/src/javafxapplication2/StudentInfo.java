/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/************************
 *Sotonte Bob-manuel
 * Lab #2
 ************************/
//Implement Event Handler for Action event
public class StudentInfo extends Application implements EventHandler<ActionEvent>
{
    //Create your buttons in global
    Button FBtn = new Button("Find");
    Button IBtn = new Button("Insert");
    Button DBtn = new Button("Delete");
    Button UBtn = new Button("Update");
    Button EBtn = new Button("Exit");
    //Create your labels and textboxes
        Label Label1 = new Label("Student Information");
        Label Label2 = new Label("ID: ");
        Label Label3 = new Label("First Name: ");
        Label Label4 = new Label("Last Name: ");
        Label Label5 = new Label("Street: ");
        Label Label6 = new Label("City: ");
        Label Label7 = new Label("State: ");
        Label Label8 = new Label("ZIP: ");
        Label Label9 = new Label("Email: ");
        Label Label10 = new Label("GPA: ");
        TextField Field1 = new TextField();
        TextField Field2 = new TextField();
        TextField Field3 = new TextField();
        TextField Field4 = new TextField();
        TextField Field5 = new TextField();
        TextField Field6 = new TextField();
        TextField Field7 = new TextField();
        TextField Field8 = new TextField();
        TextField Field9 = new TextField();

    @Override
    public void start(Stage primaryStage)
    {
        //Set your buttons for action
        FBtn.setOnAction(this);
        IBtn.setOnAction(this);
        DBtn.setOnAction(this);
        UBtn.setOnAction(this);
        EBtn.setOnAction(this);

        //Create flowpane and add your header to it for the top
        FlowPane FPane1 = new FlowPane();
        FPane1.getChildren().add(Label1);

        //Create another flowpane to display your buttons at the buttom
        FlowPane FPane2 = new FlowPane();
        FPane2.getChildren().add(FBtn);
        FPane2.getChildren().add(IBtn);
        FPane2.getChildren().add(DBtn);
        FPane2.getChildren().add(UBtn);
        FPane2.getChildren().add(EBtn);

        //Create Grid Pane for your laabels and textboxes to line them up in the center
        GridPane GPane1 = new GridPane();
        GPane1.add(Label2, 0, 0);
        GPane1.add(Label3, 0, 1);
        GPane1.add(Label4, 0, 2);
        GPane1.add(Label5, 0, 3);
        GPane1.add(Label6, 0, 4);
        GPane1.add(Label7, 0, 5);
        GPane1.add(Label8, 0, 6);
        GPane1.add(Label9, 0, 7);
        GPane1.add(Label10, 0, 8);
        GPane1.add(Field1, 1, 0);
        GPane1.add(Field2, 1, 1);
        GPane1.add(Field3, 1, 2);
        GPane1.add(Field4, 1, 3);
        GPane1.add(Field5, 1, 4);
        GPane1.add(Field6, 1, 5);
        GPane1.add(Field7, 1, 6);
        GPane1.add(Field8, 1, 7);
        GPane1.add(Field9, 1, 8);

        //Border pane on which the grid and flow pane rest
        BorderPane BPane = new BorderPane();
        
        //The Scene on which the Border pane rests
        Scene scene = new Scene(BPane, 300, 370);
        
        //Styling for the application window and its controls
        FBtn.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white;");
        IBtn.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white;");
        DBtn.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white;");
        UBtn.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white;");
        EBtn.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white;");
        Label1.setStyle("-fx-font: normal bold 20px 'serif' "); 
        Label2.setStyle("-fx-font: normal bold 10px 'serif' "); 
        Label3.setStyle("-fx-font: normal bold 10px 'serif' "); 
        Label4.setStyle("-fx-font: normal bold 10px 'serif' "); 
        Label5.setStyle("-fx-font: normal bold 10px 'serif' "); 
        Label6.setStyle("-fx-font: normal bold 10px 'serif' ");
        Label7.setStyle("-fx-font: normal bold 10px 'serif' "); 
        Label8.setStyle("-fx-font: normal bold 10px 'serif' "); 
        Label9.setStyle("-fx-font: normal bold 10px 'serif' "); 
        Label10.setStyle("-fx-font: normal bold 10px 'serif' "); 
        BPane.setPadding(new Insets(10));
        BPane.setStyle("-fx-background-color: BEIGE; ");
        BPane.setTop(FPane1);
        BPane.setCenter(GPane1);
        BPane.setBottom(FPane2);
        GPane1.setPadding(new Insets(5));
        GPane1.setVgap(5);
        FPane2.setHgap(5);
        FPane2.setPadding(new Insets(0, 0, 0, 15));
        FPane1.setPadding(new Insets(0, 0, 10, 45));

        primaryStage.setTitle("Student Information");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //The Action Event are the Actions to be carried out on the accounts of a clicked button
    @Override
    public void handle(ActionEvent action)
    {
        Student s1 = new Student();
        
        if(action.getSource() == FBtn)
        {
            String id = Field1.getText();
            s1.selectDB(Integer.parseInt(id));
            Field2.setText(s1.getFN());
            Field3.setText(s1.getLN());
            Field4.setText(s1.getStreet());
            Field5.setText(s1.getCity());
            Field6.setText(s1.getState());
            Field7.setText(String.valueOf(s1.getZIP()));
            Field8.setText(s1.getEmail());
            Field9.setText(String.valueOf(s1.getGPA()));
        }
        else if(action.getSource() == IBtn)
        {
           int id = Integer.parseInt(Field1.getText());
           String fn = Field2.getText();
           String ln = Field3.getText();
           String street = Field4.getText();
           String city = Field5.getText();
           String state = Field6.getText();
           int zip = Integer.parseInt(Field7.getText());
           String email = Field8.getText();
           double gpa = Double.parseDouble(Field9.getText());
           s1.insertDB(id, fn, ln, street, city, state, zip, email, gpa);
           System.out.println("DB inserted = " + id);
           System.out.println("DB inserted = " + fn);
           System.out.println("DB inserted = " + ln);
           System.out.println("DB inserted = " + street);
           System.out.println("DB inserted = " + city);
           System.out.println("DB inserted = " + state);
           System.out.println("DB inserted = " + zip);
           System.out.println("DB inserted = " + email);
           System.out.println("DB inserted = " + gpa);
           System.out.println("=====================");
        }
        else if(action.getSource() == DBtn)
        {
            s1.setSID(Integer.parseInt(Field1.getText()));
            s1.deleteDB();
        }
        else if(action.getSource() == UBtn)
        {
            s1.setSID(Integer.parseInt(Field1.getText()));
            s1.setFN(Field2.getText());
            s1.setLN(Field3.getText());
            s1.setStreet(Field4.getText());
            s1.setCity(Field5.getText());
            s1.setState(Field6.getText());
            s1.setZIP(Integer.parseInt(Field7.getText()));
            s1.setEmail(Field8.getText());
            s1.setGPA(Double.parseDouble(Field9.getText()));
            s1.updateDB();
        }
        else if(action.getSource() == EBtn)
        {
            //If the EBtn(Exit Button) is clicked, a message box pops up asking if they are sure
            Dialog dialog = new Dialog();
            dialog.setTitle("Exit");
            dialog.setHeaderText("Are you sure you want to Exit?");
            ButtonType YBtn = new ButtonType("Yes", ButtonData.YES);
            ButtonType NBtn = new ButtonType("No", ButtonData.NO);
            dialog.getDialogPane().getButtonTypes().addAll(YBtn, NBtn);

            dialog.showAndWait();
            //If yes is clicked the application ends/exits
            if (dialog.getResult() == YBtn)
            {
                Platform.exit();
            }
            //if no is clicked nothing happens and the application continues
            else
            {
                //
            }
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}
