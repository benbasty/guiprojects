package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    public void start(Stage stage) {


        // The layout of the first view is done with the help of the BorderPane class
        BorderPane firstLayout = new BorderPane();
        Label firstView = new Label("First view!");
        Button toSecondView = new Button("To the second view!");
        // At the top there is the text "First view!"
        firstLayout.setTop(firstView);
        // The center of the view contains a button with the text "To the second view!"
        firstLayout.setCenter(toSecondView);
        Scene firstScene = new Scene(firstLayout, 500,500);


        // The layout of the second view is done with the help of the VBox class.
        VBox secondLayout = new VBox();
        // The first element in the layout is a button with the text "To the third view!"
        Button toThirdView = new Button("To the third view!");
        // The button is followed by the text "Second view!"
        Label secondView = new Label("Second view!");
        secondLayout.getChildren().addAll(toThirdView,secondView);
        secondLayout.setSpacing(50);
        Scene secondScene = new Scene(secondLayout,500,500);

        // The third view uses the GridPane class for its layout
        GridPane thirdLayout = new GridPane();
        Label thirdView = new Label("Third view!");
        Button toFirstView = new Button("To the first view!");
        // At the coordinates (0, 0) there is a text that reads "Third view!"
        thirdLayout.add(thirdView,0,0);
        // At coordinates (1, 1) there is a button with the text "To the first view!"
        thirdLayout.add(toFirstView,1,1);
        Scene thirdScene = new Scene(thirdLayout,500,500);



        // By pressing that button the application swithces to the second view.
        toSecondView.setOnAction((event -> {
            stage.setScene(secondScene);
        }));

        // by pressing the button the application switches to the third view
        toThirdView.setOnAction((event) -> {
            stage.setScene(thirdScene);
        });

        // Pressing this button :To the first view. brings back the first view.
        toFirstView.setOnAction((event) -> {
            stage.setScene(firstScene);
        });

        stage.setScene(firstScene);
        stage.show();






    }

}
