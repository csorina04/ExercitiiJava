package ingredient;

public  class Cartofi implements Ingredient {
    String ingredientNume;
    double ingredientPret;
    String ingredientCategorie;

    public Cartofi(String nume, double pret, String categorie) {
        this.ingredientNume = nume;
        this.ingredientCategorie = categorie;
        this.ingredientPret = pret;
    }

    public Cartofi() {

    }


    @Override
    public String getIngredientName() {
        return "Cartofi";
    }

    @Override
    public double getIngredientPret() {
        return 2.0d;
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
