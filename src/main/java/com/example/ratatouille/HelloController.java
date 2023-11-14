package com.example.ratatouille;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button tableau_bord;

    @FXML
    private Button produits;

    @FXML
    private Button commandes;


    @FXML
    public void initialize() {
        // Configurer un gestionnaire d'événements pour le bouton "Tableau de bord"
        tableau_bord.setOnAction(event -> ouvrirTableauDeBord());
        produits.setOnAction(actionEvent -> ouvrirproduits());
        commandes.setOnAction(actionEvent -> ouvrircommandes());

    }

    private void ouvrircommandes() {
        try {
            // Charger le fichier FXML pour la vue "Tableau de bord"
            Parent tableauDeBordParent = FXMLLoader.load(getClass().getResource("commandes.fxml"));
            Scene tableauDeBordScene = new Scene(tableauDeBordParent);

            // Obtenir la fenêtre actuelle
            Stage window = (Stage) commandes.getScene().getWindow();

            // Mettre à jour la scène de la fenêtre avec la nouvelle scène du "Tableau de bord"
            window.setScene(tableauDeBordScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace(); // Gérer l'exception d'entrée/sortie (IOException) de manière appropriée
        }
    }

    private void ouvrirTableauDeBord() {
        try {
            // Charger le fichier FXML pour la vue "Tableau de bord"
            Parent tableauDeBordParent = FXMLLoader.load(getClass().getResource("tableau_bord.fxml"));
            Scene tableauDeBordScene = new Scene(tableauDeBordParent);

            // Obtenir la fenêtre actuelle
            Stage window = (Stage) tableau_bord.getScene().getWindow();

            // Mettre à jour la scène de la fenêtre avec la nouvelle scène du "Tableau de bord"
            window.setScene(tableauDeBordScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace(); // Gérer l'exception d'entrée/sortie (IOException) de manière appropriée
        }
    }

    private void ouvrirproduits() {
        try {
            // Charger le fichier FXML pour la vue "Tableau de bord"
            Parent tableauDeBordParent = FXMLLoader.load(getClass().getResource("produits.fxml"));
            Scene tableauDeBordScene = new Scene(tableauDeBordParent);

            // Obtenir la fenêtre actuelle
            Stage window = (Stage) produits.getScene().getWindow();

            // Mettre à jour la scène de la fenêtre avec la nouvelle scène du "Tableau de bord"
            window.setScene(tableauDeBordScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace(); // Gérer l'exception d'entrée/sortie (IOException) de manière appropriée
        }

    }
}



