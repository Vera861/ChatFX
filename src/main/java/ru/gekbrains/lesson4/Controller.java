package ru.gekbrains.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyEvent;

import java.awt.*;

public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField mainTextField;

    public void btnOneClickAction(ActionEvent actionEvent) {
        mainTextArea.appendText(mainTextField.getText() +"\n");
        mainTextField.clear();
    }


    public void handleEnterPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            mainTextArea.appendText(mainTextField.getText() +"\n");
            mainTextField.clear();
        }
    }
}
