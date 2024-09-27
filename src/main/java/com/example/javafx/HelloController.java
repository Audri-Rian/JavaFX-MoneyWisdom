package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private Button btnSubmit;

    @FXML
    private Button btnSubmit2;

    @FXML
    private Button btnSubmit3;

    @FXML
    private Button btnSubmit4;

    @FXML
    private Button btnSubmit5;

    @FXML
    private Button btnSubmit6;

    @FXML
    private Button btnSubmit7;

    @FXML
    public void handleSubmitAction(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();
        clickedButton.setStyle("-fx-background-color: #14469C;");


        String fxmlFile = "";
        if (clickedButton == btnSubmit) {
            fxmlFile = "transacoesBancarias.fxml";
        } else if (clickedButton == btnSubmit2) {
            fxmlFile = "vendas.fxml";
        } else if (clickedButton == btnSubmit3) {
            fxmlFile = "fluxoDeCaixa.fxml";
        } else if (clickedButton == btnSubmit4){
            fxmlFile = "despesas.fxml";
        } else if (clickedButton == btnSubmit5){
            fxmlFile = "funcionarios.fxml";
        } else if(clickedButton == btnSubmit6){
            fxmlFile = "Relatorios.fxml";
        }

        if (!fxmlFile.isEmpty()) {
            try {
                Pane novaPagina = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlFile)));
                Stage stage = (Stage) clickedButton.getScene().getWindow();
                stage.setScene(new Scene(novaPagina));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
