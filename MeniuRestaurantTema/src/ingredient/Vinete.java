package ingredient;

public class Vinete implements Ingredient {
    String ingredientNume;
    double ingredientPret;
    String ingredientCategorie;

    public Vinete(String nume, double pret, String categorie) {
        this.ingredientNume = nume;
        this.ingredientCategorie = categorie;
        this.ingredientPret = pret;
    }

    public Vinete() {

    }


    @Override
    public String getIngredientName() {
        return "Vinete";
    }

    @Override
    public double getIngredientPret() {
        return 10.0d;
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
