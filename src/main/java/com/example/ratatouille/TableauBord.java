package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import modele.GestionVue;
import javafx.scene.Scene;



public class TableauBord {

    @FXML
    private Button accueil;

    @FXML
    private Button produits;

    @FXML
    private Button commandes;




    @FXML
    private void ouvrirCommandes(ActionEvent event) {
        switchPane (GestionVue.getCommandes());
    }

    @FXML
    private void ouvrirAccueil(ActionEvent event) {
        switchPane (GestionVue.getAccueil());
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
