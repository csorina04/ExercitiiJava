package meniu;


import ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class menuItem {
    String itemNume;
    List<Ingredient> ingredientList = new ArrayList<Ingredient>();
    double price=0.0d;


    public menuItem(String itemNume, Ingredient... ingrediente) {
        this.itemNume = itemNume;
        for (Ingredient i : ingrediente) {
            ingredientList.add(i);
        }
    }


    public void addIngredient(Ingredient... ingrediente) {
        for (Ingredient i : ingrediente) {
            ingredientList.add(i);
        }

    }

public double calculatePrice(){
        for (Ingredient i: ingredientList) {
             price+=i.getIngredientPret();
        }return price;

}

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public String getItemNume() {
        return itemNume;
    }


    public void setIngredientList(List<Ingredient> ingredientList) {

        this.ingredientList = ingredientList;
    }


    public void setItemNume(String itemNume) {
        this.itemNume = itemNume;
    }

    @Override
    public String toString() {
        return "menuItem{" +
                "itemNume='" + itemNume + '\'' +
                ", ingredientList=" + ingredientList +
                '}';
    }


}


