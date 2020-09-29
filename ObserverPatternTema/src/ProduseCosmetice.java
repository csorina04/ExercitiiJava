import types.ProdusCosmetic;

public class ProduseCosmetice extends Magazin<ProdusCosmetic>{


    @Override
    public void unsubscribePret(Client c){
        System.out.println("Dezabonat de la Produse Cosmetice - Update Pret");
    }

    @Override
    public void unsubscribeStoc(Client c){
        System.out.println("Dezabonat de la Produse Cosmetice - Update Stoc");
    }

    @Override
    protected String convertProdus(ProdusCosmetic produse) {
        return "Produse cosmetice: " + produse.getNumeProdus();
    }
}
