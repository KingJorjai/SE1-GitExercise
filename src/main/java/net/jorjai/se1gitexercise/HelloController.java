package net.jorjai.se1gitexercise;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX application!");
        System.out.println("Mikel was here");
        System.out.println("Aitor was here");
    }
}