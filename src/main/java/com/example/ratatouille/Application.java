package com.example.ratatouille;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.GestionAccueil;
import modele.GestionCommande;
import modele.GestionProduits;
import modele.GestionVue;

import java.io.IOException;

public class Application extends  javafx.application.Application {

    private static Stage stagePrincipal;

    public void init()throws IOException{
        GestionAccueil gAccueil = new GestionAccueil();
        GestionProduits gProduits = new GestionProduits();
        GestionVue gVue = new GestionVue();
        GestionCommande gCommande = new GestionCommande();
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("accueil.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        stage.setTitle("Gestion de produit");
        stage.setScene(scene);
        stage.show();
        stagePrincipal = stage;
    }

    public static Stage getStagePrincipal(){return stagePrincipal;}

    public static void setStagePrincipal(Stage stagePrincipal){Application.stagePrincipal=stagePrincipal;}

    public static void main(String[] args) {
        launch();
    }
}