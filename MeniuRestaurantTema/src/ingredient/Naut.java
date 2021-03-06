package ingredient;

public  class Naut implements Ingredient {
    String ingredientNume;
    double ingredientPret;
    String ingredientCategorie;

    public Naut(String nume, double pret, String categorie) {
        this.ingredientNume = nume;
        this.ingredientCategorie = categorie;
        this.ingredientPret = pret;
    }

    public Naut() {

    }


    @Override
    public String getIngredientName() {
        return "Naut";
    }

    @Override
    public double getIngredientPret() {
        return 8.0d;
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
