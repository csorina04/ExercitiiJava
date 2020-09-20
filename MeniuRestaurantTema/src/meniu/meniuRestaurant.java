package meniu;

import Display.DisplayMenu;

import java.util.ArrayList;
import java.util.List;


public class meniuRestaurant implements DisplayMenu {

    private String nume;
    private String categorie;
    List list = new ArrayList<>();


    public meniuRestaurant(String nume, String categorie) {
        this.nume = nume;
        this.categorie = categorie;
    }

    public String getNumeMeniu() {
        return nume;
    }


    public void addMenuItem(menuItem p) {
        list.add(p);
    }

    public void searchItem(menuItem p) {
        list.contains(p);

    }


    @Override
    public void displayMenu() {

    }
}




