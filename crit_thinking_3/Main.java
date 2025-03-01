package crit_thinking_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX menu app");

        BorderPane root = new BorderPane();
        TextBox textBox = new TextBox();
        root.setCenter(textBox.getTextBox());

        MenuBar menuBar = new MenuBar(textBox, root);
        root.setTop(menuBar.getMenuBar());

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}