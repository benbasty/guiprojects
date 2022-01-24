package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {

    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();
        layout.setTop(new Label("North"));
        //layout.setLeft(new Label("Left"));
        layout.setRight(new Label("East"));
        layout.setBottom(new Button("South"));
        //layout.setCenter(new Button("Center"));

        Scene scene = new Scene(layout);


        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }

}
