package ingredient;

public class CarneVita implements Ingredient {
    String ingredientNume="Carne Vita";
    double ingredientPret;
    String ingredientCategorie;

    public CarneVita(String nume, double pret, String categorie) {
        this.ingredientNume = nume;
        this.ingredientCategorie = categorie;
        this.ingredientPret = pret;
    }

    public CarneVita() {

    }


    @Override
    public String getIngredientName() {
        return "Carne Vita";
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
