package sample;


import java.net.URL;
import java.security.Key;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    public TextField enterText;

    @FXML
    public Button sendText;

    @FXML
    public TextArea textShower;

    @FXML
    void initialize() {
        actionButton();

        enterText.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().getCode() == 10){
                    sendMessage();
                }
            }
        });

    }



    public void sendMessage(){
        textShower.appendText(enterText.getText()+"\n");
        enterText.clear();
        enterText.requestFocus();
    }



    public void actionButton(){
        sendText.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sendMessage();
            }
        });
    }

}
