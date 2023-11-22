package modele;

import javafx.beans.property.*;

public class Produit{

    private static IntegerProperty refProduit;
    private static StringProperty nomProduit;
    private StringProperty typeProduit;
    private FloatProperty prixProduit;
    private static IntegerProperty quantiteProduit;

    public Produit(){
        this.refProduit = new SimpleIntegerProperty();
        this.nomProduit = new SimpleStringProperty();
        this.typeProduit = new SimpleStringProperty();
        this.prixProduit = new SimpleFloatProperty();
        this.quantiteProduit = new SimpleIntegerProperty();
    }

    public int getRefProduit() {
        return refProduit.get();
    }





    public void setRefProduit(int refProduit) {
        this.refProduit.set(refProduit);
    }

    public String getNomProduit() {
        return nomProduit.get();
    }

    public static StringProperty nomProduitProperty() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit.set(nomProduit);
    }

    public String getTypeProduit() {
        return typeProduit.get();
    }

    public StringProperty typeProduitProperty() {
        return typeProduit;
    }

    public void setTypeProduit(String typeProduit) {
        this.typeProduit.set(typeProduit);
    }

    public float getPrixProduit() {
        return prixProduit.get();
    }

    public FloatProperty prixProduitProperty() {
        return prixProduit;
    }

    public void setPrixProduit(float prixProduit) {
        this.prixProduit.set(prixProduit);
    }

    public int getQuantiteProduit() {
        return quantiteProduit.get();
    }




    public void setQuantiteProduit(int quantiteProduit) {
        this.quantiteProduit.set(quantiteProduit);
    }
}
