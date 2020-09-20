package meniu;

import Display.DisplayMenu;

import java.util.ArrayList;
import java.util.List;


public class meniuRestaurant implements DisplayMenu {

    private String nume;
    private String categorie;
    List list = new ArrayList<>();
    List<menuItem> menuItemList = new ArrayList<menuItem>();

    public meniuRestaurant(String nume, String categorie) {
        this.nume = nume;
        this.categorie = categorie;
    }

    public String getNumeMeniu() {
        return nume;
    }


    public void addMenuItem(menuItem p) {
        menuItemList.add(p);
    }

    public void searchItem(String p) {
        list.contains(p);

    }


    public void displayMenu() {
        for (menuItem m : menuItemList) {
            System.out.println(m.getItemNume() + "  Ingrediente:  " + m.getIngredientList() + "pret:  " + m.calculatePrice());
        }


    }

    public void searchByName(String itemNume) {
        for (menuItem m : menuItemList) {
            if (m.toString().contains(itemNume)) {
                System.out.println(m.getItemNume() + " price: " + m.calculatePrice());
            }

        }
    }

}




