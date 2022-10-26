/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.escola.sistemaescolar.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Cliente
 */
public class LoginController implements Initializable {
    @FXML
    private TextField campoUser;

    @FXML
    private TextField campoSenha;

    @FXML
    private Button btnEntrar;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnEntrar.setOnMouseClicked(((event) -> {
            //verificação
            if(campoSenha.getText().equals("admin") && campoUser.getText().equals("admin")){
                initPrincipal();    
            }
        }));
    }

    private void initPrincipal() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/br/org/escola/sistemaescola/view/BarraProgressoView.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            btnEntrar.getScene().getWindow().hide();
            stage.setScene(scene);
            stage.show();
        
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
