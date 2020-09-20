package ingredient;

public  class CoastePorc implements Ingredient {
    String ingredientNume;
    double ingredientPret;
    String ingredientCategorie;

    public CoastePorc(String nume, double pret, String categorie) {
        this.ingredientNume = nume;
        this.ingredientCategorie = categorie;
        this.ingredientPret = pret;
    }

    public CoastePorc() {

    }


    @Override
    public String getIngredientName() {
        return "Coaste Porc";
    }

    @Override
    public double getIngredientPret() {
        return 20.0d;
    }

    @Override
    public String getCategorie() {
        return "carne";
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
