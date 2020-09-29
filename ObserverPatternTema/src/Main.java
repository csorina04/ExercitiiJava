import types.ProdusAlimentar;
import types.ProdusCosmetic;

public class Main {
    /*
        Folosind conceputl de Observer Pattern rezolvati urmatoarea problema.

        Create o clasa magazin care contine o lista de produse. Clienti
        pot cumpara aceste produse sau pot alege sa fie notificati
        cand produsul reintra in stoc sau i se updateaza pretul.
        Folositi Map pentru a tine o legatura intre produs ,tip de notificare
        si cei subscrisi pentru notificari.

        In momentul in care un client care are nume prenume primeste notificare
        o afiseaza pe ecran. adaugand la informatiile despre notificare si numele sau.


     */
    public static void main(String[] args) {

        ProduseAlimentare produseAlimentare = new ProduseAlimentare();
        ProduseCosmetice produseCosmetice = new ProduseCosmetice();

        Client1 client1 = new Client1();
        produseAlimentare.subscribePret(client1);
        produseCosmetice.subscribeStoc(client1);

        Client1 client2 = new Client1();
        produseCosmetice.subscribePret(client2);
        produseCosmetice.subscribeStoc(client2);

        System.out.println();
        produseAlimentare.adaugareProdus(new ProdusAlimentar("Paine", 2, 2));
        produseAlimentare.adaugareProdus(new ProdusAlimentar("Oua", 10, 2));
        produseAlimentare.unsubscribePret(client1);
        produseAlimentare.adaugareProdus(new ProdusAlimentar("Oua", 15, 2));
        produseAlimentare.adaugareProdus(new ProdusAlimentar("Lapte", 6, 1));
        produseAlimentare.adaugareProdus(new ProdusAlimentar("Carne", 20, 3));

        System.out.println();
        produseCosmetice.adaugareProdus(new ProdusCosmetic("Sapun", 2, 3));
        produseCosmetice.adaugareProdus(new ProdusCosmetic("Sampon", 20, 3));
        produseCosmetice.adaugareProdus(new ProdusCosmetic("Pasta de dinti", 8, 3));
        produseCosmetice.adaugareProdus(new ProdusCosmetic("Burete", 2, 3));
        produseAlimentare.adaugareProdus(new ProdusAlimentar("Carne", 25, 3));
        produseAlimentare.subscribePret(client1);
    }
}
