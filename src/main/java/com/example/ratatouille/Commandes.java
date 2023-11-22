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

public class Commandes {

    @FXML
    private Button tableau_bord;

    @FXML
    private Button produits;

    @FXML
    private Button accueil;




    @FXML
    private void ouvrirTableauDeBord(ActionEvent event) {
        switchPane(GestionVue.getTableauDeBord());

    }

    @FXML
    private void ouvrirProduits(ActionEvent event) {
        switchPane (GestionVue.getProduits());


    }

    @FXML
    private void ouvrirAccueil(ActionEvent event) {
        switchPane (GestionVue.getAccueil());
    }
    private void switchPane(Scene scene){
        Application.getStagePrincipal().setScene(scene);
        Application.getStagePrincipal().show();
    }
}

