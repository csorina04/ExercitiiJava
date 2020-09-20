package meniu;

import java.util.ArrayList;
import java.util.List;
import static Display.displayMenu.displayMenu;
import meniu.Produs;
public class meniuRestaurant {

    private String nume;
    private String categorie;
    public Display.displayMenu displayMenu;
    private List<Produs> listaProduse = new ArrayList<>();
      List list = new ArrayList<>();


    public meniuRestaurant(String nume, String categorie) {
        this.nume = nume;
        this.categorie = categorie;

    }



    public void searchProdus(Produs p) {
        list.contains(p);

    }

    public void displayProduse() {
        for (Produs p : listaProduse) {
            displayMenu(p);

        }

    }

    public void addMenuItem(Produs p) {
        list.add(p);
    }


}
