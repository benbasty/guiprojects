package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatistics extends Application {
    public static void main(String[] args) {
        launch(TextStatistics.class);
    }
    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        HBox buttons = new HBox();
        buttons.setSpacing(20);
        buttons.getChildren().add(new Button("First"));
        buttons.getChildren().add(new Button("Second"));
        buttons.getChildren().add(new Button("Third"));

        VBox texts = new VBox();
        texts.setSpacing(20);
        texts.getChildren().add(new Label("Letters: 0"));
        texts.getChildren().add(new Label("Words: 0"));
        texts.getChildren().add(new Label("The longest word is:"));

        layout.setTop(buttons);
        layout.setLeft(texts);
        layout.setCenter(new TextArea("Enter Your Text Here ..."));

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();

    }
}
