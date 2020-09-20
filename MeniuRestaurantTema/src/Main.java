import Display.DisplayMenu;
import meniu.Restaurant;
import meniu.meniuRestaurant;
import meniu.menuItem;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Restaurant r = new Restaurant("GoodFood");
        ArrayList<menuItem> menu1 = new ArrayList<menuItem>();
        meniuRestaurant menu3 = new meniuRestaurant("HealthyMenu", "Healthy Choice");
        meniuRestaurant menu4 = new meniuRestaurant("Junk Food", "Junk");
        //  ArrayList<meniuRestaurant> menu2=new ArrayList<meniuRestaurant>();
        r.addMenu(menu3);
        r.addMenu(menu4);

        ArrayList<menuItem> menu2 = new ArrayList<menuItem>();
        menu3.addMenuItem(new menuItem("Salata de rosii", "20", "Salate"));
        menu3.addMenuItem(new menuItem("Salata de rosii", "20", "Salate"));
        menu3.addMenuItem(new menuItem("Salata de vinete", "20", "Salate"));
        menu3.addMenuItem(new menuItem("Humus", "10", "Spreads"));
        menu4.addMenuItem(new menuItem("Cartofi prajiti", "10", "Garnituri"));
        menu4.addMenuItem(new menuItem("Burger", "30", "Fel principal"));
        menu4.addMenuItem(new menuItem("Piure", "10", "Garnituri"));
        menu4.addMenuItem(new menuItem("Coaste de porc", "20", "Fel principal"));
        menu3.displayMenu();
        menu4.displayMenu();
        r.displayItems(menu3);
        r.displayItems(menu4);

    }
}
