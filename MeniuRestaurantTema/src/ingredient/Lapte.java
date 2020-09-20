package ingredient;

public  class Lapte implements Ingredient {
    String ingredientNume;
    double ingredientPret;
    String ingredientCategorie;

    public Lapte(String nume, double pret, String categorie) {
        this.ingredientNume = nume;
        this.ingredientCategorie = categorie;
        this.ingredientPret = pret;
    }

    public Lapte() {

    }


    @Override
    public String getIngredientName() {
        return "Lapte";
    }

    @Override
    public double getIngredientPret() {
        return 2.0d;
    }

    @Override
    public String getCategorie() {
        return "Lactate";
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
