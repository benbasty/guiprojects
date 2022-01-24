package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notifier extends Application {
    public static void main(String[] args) {
        launch(Notifier.class);
    }
    @Override
    public void start(Stage stage) {

        TextField enteredText = new TextField();
        Button update = new Button("Update");
        Label label = new Label("");

        update.setOnAction((event) -> {
            label.setText(enteredText.getText());
        });

        VBox layout = new VBox();
        layout.getChildren().add(enteredText);
        layout.getChildren().add(update);
        layout.getChildren().add(label);
        layout.setSpacing(2);


        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();

    }
}
