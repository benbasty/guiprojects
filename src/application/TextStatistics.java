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

import java.util.Arrays;

public class TextStatistics extends Application {
    public static void main(String[] args) {
        launch(TextStatistics.class);
    }
    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        TextArea ta = new TextArea();
        layout.setCenter(ta);

        HBox texts = new HBox();
        texts.setSpacing(25);


        Label l = new Label("Letters: 0");
        Label w = new Label("Words: 0");
        Label lg = new Label("The longest word is:");

        texts.getChildren().addAll(l, w, lg);
        layout.setBottom(texts);

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();

        ta.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            l.setText("Letters: " + String.valueOf(characters));
            w.setText("Words: " + String.valueOf(words));
            lg.setText("The longest word is: " + String.valueOf(longest));
        });

    }
}
