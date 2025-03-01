package crit_thinking_3;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class AppMenu {
    private MenuBar menuBar;
    private TextBox textBox;
    private BorderPane root;

    //constructor
    public AppMenu(TextBox textBox, BorderPane root) {
        this.textBox = textBox;
        this.root = root;
        initializeMenuBar();
    }

    private void initializeMenuBar() {
        menuBar = new MenuBar();
        Menu menu = new Menu("Options");

        MenuItem printDateTime = new MenuItem("Print Date and Time");
        printDateTime.setOnAction(e -> {
            String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss"));
            textBox.setText(dateTime);
        });

        MenuItem writeToFile = new MenuItem("Write to file");
        writeToFile.setOnAction(e -> {
            try {
                Utilities.writeToFile("log.txt", textBox.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        MenuItem changeColor = new MenuItem("Change background color");
        changeColor.setOnAction(e -> {
            Random random = new Random();
            int hue = 60 + random.nextInt(61); //random green hue
            root.setStyle("-fx-background-color: hsb(" + hue + ", 100%, 100%);");
            changeColor.setText("Change background color (Hue: " + hue + ")");
        });

        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(e -> {
            Stage stage = (Stage) menuBar.getScene().getWindow();
            stage.close();
        });

        menu.getItems().addAll(printDateTime, writeToFile, changeColor, exit);
        menuBar.getMenus().add(menu);

        }

        public MenuBar getMenuBar() {
            return menuBar;
        }
}
