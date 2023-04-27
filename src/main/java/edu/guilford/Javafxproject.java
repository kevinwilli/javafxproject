package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class Javafxproject extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //instantiate a VBox object
        VBox root = new VBox();
        //instantiate a Scene object    
        scene = new Scene(root, 800, 650);
        //increase the scene size
        
         //instantiate a new Life object
        Life life = new Life("John", "Human", "Student");
        //add the LifePane object to the VBox object
        root.getChildren().add(new LifePane(life));
        //set the title of the stage
        stage.setTitle("The Life");
       
        //scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}