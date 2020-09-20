package ingredient;

public class Rosii implements Ingredient {
    String ingredientNume;
    double ingredientPret;
    String ingredientCategorie;

    public Rosii(String nume, double pret, String categorie) {
        this.ingredientNume = nume;
        this.ingredientCategorie = categorie;
        this.ingredientPret = pret;
    }

    public Rosii() {

    }


    @Override
    public String getIngredientName() {
        return "Rosii";
    }

    @Override
    public double getIngredientPret() {
        return 5.0d;
    }

    @Override
    public String getCategorie() {
        return "Legume";
    }


    public void setIngredientPret(double ingredientPret) {
        this.ingredientPret = ingredientPret;
    }


    public void setIngredientCategorie(String ingredientCategorie) {
        this.ingredientCategorie = ingredientCategorie;
    }


    public void setIngredientNume(String ingredientNume) {
        this.ingredientNume = ingredientNume;
    }



}
