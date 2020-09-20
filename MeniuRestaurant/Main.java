import meniu.meniuRestaurant;
import meniu.Produs;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Produs> menu1 = new ArrayList<Produs>();
         meniuRestaurant menu3 = new meniuRestaurant("HealthyMenu","Healthy Choice" );
         meniuRestaurant menu4 = new meniuRestaurant("Junk Food", "Junk") ;
          ArrayList<meniuRestaurant> menu2=new ArrayList<meniuRestaurant>();
          menu3.addMenuItem("Salata de rosii");


        ArrayList<Produs> menu2 = new ArrayList<Produs>();
        menu1.add(new Produs("Salata de rosii", "20", "Salate"));
        menu1.add(new Produs("Salata de rosii", "20", "Salate"));
        menu1.add(new Produs("Salata de vinete", "20", "Salate"));
        menu1.add(new Produs("Humus", "10", "Spreads"));
        menu2.add(new Produs("Cartofi prajiti", "10", "Garnituri"));
        menu2.add(new Produs("Burger", "30", "Fel principal"));
        menu2.add(new Produs("Piure", "10", "Garnituri"));
        menu2.add(new Produs("Coaste de porc", "20", "Fel principal"));
    }
}
