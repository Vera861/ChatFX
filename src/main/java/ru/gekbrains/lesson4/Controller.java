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
    @FXML
    Button btnSend;

    public void btnOneClickAction(ActionEvent actionEvent) {
        if (mainTextField.getText().trim().length() > 0) {
            mainTextArea.appendText(mainTextField.getText() + "\n");
            mainTextField.clear();
        }

    }


    public void handleEnterPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            if (mainTextField.getText().trim().length() > 0) {
                mainTextArea.appendText(mainTextField.getText() + "\n");
                mainTextField.clear();
            }
        }
    }
}
