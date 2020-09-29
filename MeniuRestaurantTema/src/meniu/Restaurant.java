package meniu;

import Display.DisplayMenu;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String nume;
    List list = new ArrayList();
    private List<menuItem> menuItemList = new ArrayList<>();
    private List<meniuRestaurant> meniuRestaurantList = new ArrayList<meniuRestaurant>();

    public Restaurant(String nume) {

        this.nume = nume;
    }

    public String getNumeRestaurant() {

        return this.nume;
    }


    public void addMenu(meniuRestaurant m) {

        list.add(m);
    }

    public void displayItems(DisplayMenu displayMenu) {
        for (meniuRestaurant m : meniuRestaurantList) {
            displayMenu.displayMenu();
        }
    }

}



