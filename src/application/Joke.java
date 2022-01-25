package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Joke extends Application {
    public static void main(String[] args) {
        launch(Joke.class);
    }
    public void start(Stage stage) {
        // main layout
        BorderPane layout = new BorderPane();
        // menu
        HBox menu = new HBox();
        menu.setPadding(new Insets(10,20,10,10));
        menu.setSpacing(10);
        // buttons
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        // adding buttons to menu
        menu.getChildren().addAll(joke, answer, explanation);
        layout.setTop(menu);

        // subviews layout
        StackPane firstLayout = createView("Why was the metal wire so upset?");
        StackPane secondLayout = createView("It was getting bent out of shape over nothing!");
        StackPane thirdLayout = createView("Metal wire comes in all sorts of sizes, \nmeasured by how thick it is.  \nElectrical wire also comes in different thicknesses. ");

        // add subviews to button
        joke.setOnAction((event) -> { layout.setCenter(firstLayout);});
        answer.setOnAction((event) -> { layout.setCenter(secondLayout);});
        explanation.setOnAction((event) -> { layout.setCenter(thirdLayout);});


        // set initial view
        layout.setCenter(firstLayout);

        // main scene with layout
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();



    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300,200);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;

    }


}
