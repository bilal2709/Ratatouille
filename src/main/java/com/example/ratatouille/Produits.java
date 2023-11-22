package com.example.ratatouille;

import javafx.beans.property.Property;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modele.GestionVue;
import modele.Produit;

import java.io.IOException;

public class Produits {

    @FXML
    private Button accueil;

    @FXML
    private Button tableau_bord;

    @FXML
    private Button commandes;

    @FXML
    private ChoiceBox <String> typeProduit;

    @FXML
    private TextField refProduit;

    @FXML
    private TextField nomProduit;
    @FXML
    private TextField prixProduit;
    @FXML
    private TextField quantiteProduit;


    @FXML
    private void initialize(){
        //refProduit.textProperty().bindBidirectional(Produit.refProduitProperty());
        //nomProduit.textProperty().bindBidirectional(Produit.nomProduitProperty());
        //prixProduit.textProperty().bindBidirectional(Produit.quantiteProduitProperty());

        //typeProduit.getItems().addAll("Légumes","Viande","Fruits","Viennoiserie","Féculent","Légumineuses");
    }




    @FXML
    private void ouvrirCommandes(ActionEvent event) {
        switchPane (GestionVue.getCommandes());
    }

    @FXML
    private void ouvrirAccueil(ActionEvent event) {
        switchPane (GestionVue.getAccueil());
    }

    @FXML
    private void ouvrirTableauDeBord(ActionEvent event) {
        switchPane(GestionVue.getTableauDeBord());

    }
    private void switchPane(Scene scene){
        Application.getStagePrincipal().setScene(scene);
        Application.getStagePrincipal().show();
    }


    @FXML
    void ajouterProduit(ActionEvent event) {

    }

    @FXML
    void effacerProduit(ActionEvent event) {

    }

    @FXML
    void mettreAJourProduit(ActionEvent event) {

    }

    @FXML
    void supprimerProduit(ActionEvent event) {

    }
}
