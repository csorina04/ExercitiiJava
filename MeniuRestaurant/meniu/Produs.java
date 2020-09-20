package meniu;


import java.util.ArrayList;
import java.util.List;

import java.util.Objects;

public class Produs {


    String nume;
    String pret;
    String categorie;
    String ingrediente;
    List list = new ArrayList();

    public Produs(String nume, String pret, String categorie) {

        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;

    }

    public Produs(String nume, String pret, String categorie, String ingrediente) {
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
        this.ingrediente = ingrediente;
    }


    public String getNume() {
        return nume;

    }

    public String getPret() {
        return pret;

    }

    public String getCategorie() {
        return categorie;
    }

    public String getIngrediente() {
        return ingrediente;

    }

}


