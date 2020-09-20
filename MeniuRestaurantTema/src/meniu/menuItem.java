package meniu;


import java.util.ArrayList;
import java.util.List;

import java.util.Objects;

public class menuItem extends meniuRestaurant {

    String nume;
    String pret;
    String categorie;
    String ingrediente;


    public menuItem(String nume, String pret, String categorie) {
        super(nume, categorie);

        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;

    }

    public menuItem(String nume, String pret, String categorie, String ingrediente) {
           super(nume, categorie);
                this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
        this.ingrediente = ingrediente;
    }


    public String getNumeItem() {
        return nume;

    }

    public String getPretItem() {
        return pret;

    }

    public String getCategorieItem() {
        return categorie;
    }

    public String getIngredienteItem() {
        return ingrediente;

    }

}


