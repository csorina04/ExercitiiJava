import types.ProdusAlimentar;

public class ProduseAlimentare extends Magazin<ProdusAlimentar> {


/*
    public ProduseAlimentare(String numeProdus, Integer pretProdus, Integer stocProdus) {
    }


 */

    @Override
    public void unsubscribePret(Client c){
        System.out.println("Unsubscribed de la Produse Alimentare - update pret");
       unsubscribePret(c);
    }

    @Override
    public void unsubscribeStoc(Client c){
        System.out.println("Unsubscribed de la Produse Alimentare - update Stoc");
        unsubscribeStoc(c);
    }

    @Override
    protected String convertProdus(ProdusAlimentar produse) {
        return "Nume Produs" + produse.getNumeProdus();
    }

}
