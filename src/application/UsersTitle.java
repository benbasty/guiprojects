package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

public class UsersTitle extends Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a title");
        String title = scanner.nextLine();
        Application.launch(UsersTitle.class,
                "User's title: " + title);

    }

    @Override
    public void start(Stage stage) {

        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        stage.setTitle(title);
        stage.show();
    }
}
