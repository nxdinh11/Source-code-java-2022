package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class helllo extends Application  {

    private Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
                primaryStage.setTitle("Hello World");
                button = new Button("Say Hello World");
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        System.out.println("Hello HowKteam");
                    }
                });


                StackPane layout = new StackPane();
                layout.getChildren().add(button);
                Scene scene = new Scene(layout, 300, 250);
                primaryStage.setScene(scene);
                primaryStage.show();


        }
    }


