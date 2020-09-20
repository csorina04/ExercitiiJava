import Display.DisplayMenu;
import ingredient.CarneVita;
import ingredient.Cartofi;
import ingredient.CoastePorc;
import ingredient.Lapte;
import ingredient.Naut;
import ingredient.Rosii;
import ingredient.Vinete;
import meniu.Restaurant;
import meniu.meniuRestaurant;
import meniu.menuItem;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant("GoodFood Restaurant");
        meniuRestaurant menu3 = new meniuRestaurant("HealthyMenu", "Healthy Choice");
        meniuRestaurant menu4 = new meniuRestaurant("Junk Food", "Junk");

        menu3.addMenuItem(new menuItem("Salata de rosii", new Rosii()));
        menu3.addMenuItem(new menuItem("Salata de Cartofi", new Cartofi()));


        menu3.addMenuItem(new menuItem("Salata de vinete", new Vinete()));
        menu3.addMenuItem(new menuItem("Humus", new Naut()));
        menu4.addMenuItem(new menuItem("Cartofi prajiti", new Cartofi()));
        menu4.addMenuItem(new menuItem("Burger", new CarneVita()));
        menu4.addMenuItem(new menuItem("Piure", new Cartofi(), new Lapte()));
        menu4.addMenuItem(new menuItem("Coaste de porc", new CoastePorc()));

        System.out.println((r.getNumeRestaurant()));
        r.addMenu(menu3);
        r.addMenu(menu4);
        System.out.println(menu3.getNumeMeniu());
        menu3.displayMenu();
        System.out.println(menu4.getNumeMeniu());
        menu4.displayMenu();

        menu4.searchByName("Piure");

        r.displayItems(menu3);
        r.displayItems(menu4);

    }


}


