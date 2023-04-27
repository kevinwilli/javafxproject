package edu.guilford;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class LifePane extends GridPane {

    // createa Life attribute
    private Life life;

    // instantiate labels for the attributes
    private Label nameLabel = new Label();
    private Label groupLabel = new Label();
    // private Label ageLabel = new Label();
    private Label jobLabel = new Label();
    // private Label healthLabel = new Label();

    // add textfields for the attributes
    private TextField nameTextField;
    private TextField groupTextField;
    // private TextField ageTextField;
    private TextField jobTextField;
    // private TextField healthTextField;

    // add a submit button attribute
    private Button submitButton;
    //add a submit button attribute
    private Button submitButton2;
    //add a checkbox attribute
    private CheckBox checkBox;
    //add a slider attribute
    private Slider slider;
    
    //add a imageview attribute
    private ImageView imageView;

    // constructor
    public LifePane(Life life) {
        
         // set the life attribute
         this.life = life;
        // set the labels
        nameLabel.setText("Name: "+life.getName());
        groupLabel.setText("Group: "+life.getGroup());
        // ageLabel.setText("Age: ");
        jobLabel.setText("Job: "+life.getJob());
        // healthLabel.setText("Health: ");

        // instantiate text fields for the attributes
        TextField nameTextField = new TextField();
        TextField groupTextField = new TextField();
        // private TextField ageTextField = new TextField();
        TextField jobTextField = new TextField();
        // private TextField healthTextField = new TextField();

        // instantiate a button to submit the changes
        submitButton = new Button("Submit");
        //instantiate a button to submit the changes
        submitButton2 = new Button("Change Image");
        //instantiate a checkbox
        checkBox = new CheckBox("background color");
        //instantiate a slider
        slider = new Slider();

        //get the image the file of the image the the resource folder
        File file = new File(getClass().getResource("image.jpg").getPath());


        //instantiate a imageview attribute with the image file
        imageView = new ImageView(file.toURI().toString());
        

        // set the text fields
        nameTextField.setText(life.getName());
        groupTextField.setText(life.getGroup());
        // ageTextField.setText(life.getAge());
        jobTextField.setText(life.getJob());
        // healthTextField.setText(life.getHealth());

        // add the labels to the pane
        this.add(nameLabel, 0, 0);
        
        this.add(groupLabel, 0, 1);
        // this.add(ageLabel, 0, 2);
        this.add(jobLabel, 0, 3);
        // this.add(healthLabel, 0, 4);

        // add the text fields to the pane next to the labels
        this.add(nameTextField, 1, 0);
        this.add(groupTextField, 1, 1);
        // this.add(ageTextField, 1, 2);
        this.add(jobTextField, 1, 3);
        // this.add(healthTextField, 1, 4);

       //add the button to the pane

        this.add(submitButton, 1, 5);
        //add the button to the pane at the bottom center  of the first image
        this.add(submitButton2, 1, 7);
        //add the checkbox to the pane next to the submit button
        this.add(checkBox, 0, 5);
        //add the slider to the pane at the top center of the first image
        this.add(slider, 1, 8);
        
        //add a listener to the checkbox that changes the background color to red when the checkbox is selected
        checkBox.setOnAction(e -> {
            if(checkBox.isSelected()){
                this.setStyle("-fx-background-color: red");
            }
            else{
                this.setStyle("-fx-background-color: white");
            }
        });
        

        // set the action for the button
        submitButton.setOnAction(e -> {
            // set the attributes to the text field values
            life.setName(nameTextField.getText());
            life.setGroup(groupTextField.getText());
            // life.setAge(ageTextField.getText());
            life.setJob(jobTextField.getText());
            // life.setHealth(healthTextField.getText());

            // set the labels to the new values
            nameLabel.setText("Name: "+life.getName());
            groupLabel.setText("Group: "+life.getGroup());
            // ageLabel.setText("Age: "+life.getAge());
            jobLabel.setText("Job: "+life.getJob());
            // healthLabel.setText("Health: "+life.getHealth());
        });

        // set the pane
        this.setHgap(10);
        this.setVgap(10);

        //add the imageview to the pane at the bottom center into the second column
        this.add(imageView, 1, 6);

        // add a listener to the imageview that reduce the size of the image when the mouse is over the image
        imageView.setOnMouseEntered(e -> {
            imageView.setFitHeight(200);
            imageView.setFitWidth(200);
        });

        // add a listener to the imageview that increase the size of the image when the mouse clicks the image
        imageView.setOnMouseClicked(e -> {
            imageView.setFitHeight(400);
            imageView.setFitWidth(400);
        });


        //get the image the file of the image the the resource folder
         File file2 = new File(getClass().getResource("image2.jpg").getPath());

         //add listener to the imageview that sets the image to the second image when the mouse clicks the change image button
        submitButton2.setOnAction(e -> {
            imageView.setImage(new javafx.scene.image.Image(file2.toURI().toString()));
        });
        
        //add a listener that sets the image to the first image when the mouse leaves the root node
        this.setOnMouseExited(e -> {
            imageView.setImage(new javafx.scene.image.Image(file.toURI().toString()));
        });
        
       //add a listener to the slider that changes the background color on the red
        slider.valueProperty().addListener(e -> {
            this.setStyle("-fx-background-color: rgb(0, 0, "+slider.getValue()+")");
        });
        //give a title for the image
        imageView.setAccessibleText("life best picture");


    }

}
