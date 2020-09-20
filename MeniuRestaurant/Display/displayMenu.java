package Display;

import meniu.Produs;

public interface displayMenu {
   
    public static void displayMenu(Produs Produs) {

        System.out.println("meniu.meniuRestaurant.Produs" + Produs.getNume() + "Pret  " + Produs.getPret() + "Categorie" + Produs.getCategorie());
    }
}