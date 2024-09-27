package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.event.ActionEvent;

import java.util.Objects;

public class HelloController {

    @FXML
    private Button btnSubmit;

    @FXML
    public void handleSubmitAction(ActionEvent event) {


        try {
            Parent secondPage = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("transacoesBancarias.fxml")));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Define a nova cena
            Scene scene = new Scene(secondPage);
            stage.setScene(scene);
            stage.show();
            btnSubmit.setStyle("-fx-background-color: #14469C;");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}