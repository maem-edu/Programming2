package crit_thinking_3;

import javafx.scene.control.TextArea;

public class TextBox {
    private TextArea textBox;

    //constructor
    public TextBox() {
        textBox = new TextArea();
        textBox.setEditable(false);
    }

    //textbox getter method
    public TextArea getTextBox() {
        return TextBox;
    }

    //text setter method
    public void setText(String text) {
        textBox.setText(text);
    }

    //text getter method
    public String getText() {
        return textBox.getText();
    }
}