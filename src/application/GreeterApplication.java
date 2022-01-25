package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
    public void start(Stage stage) {


        BorderPane firstLayout = new BorderPane();
        VBox viewBox = new VBox();
        // Insets(top, right, bottom, left)
        viewBox.setPadding(new Insets(10, 50, 50, 50));
        firstLayout.setCenter(viewBox);
        Label askForUsername = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button startButton = new Button("Start");
        viewBox.getChildren().addAll(askForUsername,textField,startButton);
        viewBox.setSpacing(10);
        Scene firstScene = new Scene(firstLayout,250,250);


        BorderPane secondLayout = new BorderPane();
        VBox secondViewBox = new VBox();
        secondViewBox.setPadding(new Insets(50, 50, 50, 50));
        Label secondViewText = new Label("");
        secondViewBox.getChildren().add(secondViewText);
        secondLayout.setCenter(secondViewBox);
        Scene secondScene = new Scene(secondLayout,250,250);

        startButton.setOnAction((event) -> {
            stage.setScene(secondScene);
            secondViewText.setText("Welcome " + textField.getText() + "!");
        });

        stage.setScene(firstScene);
        stage.show();




    }
}
