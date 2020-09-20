package ingredient;

import java.util.ArrayList;

public class Ingredient {

    String nume;
    String pret;

    public Ingredient(String nume, String pret) {
        //  ListaIngrediente =new ArrayList<>();
        this.nume = nume;
        this.pret = pret;

    }

    public String getIngredientName() {
        return nume;
    }

    public String getIngredientPret() {
        return pret;
    }

}
