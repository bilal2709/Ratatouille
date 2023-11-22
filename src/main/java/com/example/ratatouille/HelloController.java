package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.GestionVue;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button tableau_bord;

    @FXML
    private Button produits;

    @FXML
    private Button commandes;




    @FXML
    private void ouvrirCommandes(ActionEvent event) {
        switchPane (GestionVue.getCommandes());
    }

    @FXML
    private void ouvrirTableauDeBord(ActionEvent event) {
        switchPane(GestionVue.getTableauDeBord());

    }

    @FXML
    private void ouvrirProduits(ActionEvent event) {
        switchPane (GestionVue.getProduits());


    }
    private void switchPane(Scene scene){
        Application.getStagePrincipal().setScene(scene);
        Application.getStagePrincipal().show();
    }
}



