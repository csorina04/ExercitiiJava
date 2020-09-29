import java.util.ArrayList;
import java.util.List;

public abstract class Magazin<T> {
    /*
        Create o clasa magazin care contine o lista de produse. Clienti
        pot cumpara aceste produse sau pot alege sa fie notificati
        cand produsul reintra in stoc sau i se updateaza pretul.

     */

    private List<T> produse = new ArrayList<>();
    public List<Client> clienti = new ArrayList();


    Integer stocProdus;


    public void adaugareProdus(T produs) {
        produse.add(produs);
      /*  for (Client c : clienti) {
            c.updateStoc((convertProdus(produs)));
            c.updatePret((convertProdus(produs)));
        }

       */
    }

    protected abstract String convertProdus(T produse);//nu inteleg de ce am nevoie de ConvertProdus

    public void schimbarePret(T produs) {

    }


    public void subscribePret(Client c) {
        clienti.add(c);

    }

    public void unsubscribePret(Client c) {
        clienti.remove(c);
    }


    public void subscribeStoc(Client c) {
        clienti.add(c);

    }

    public void unsubscribeStoc(Client c) {
        clienti.remove(c);
    }


    public Integer getStocProdus() {
        return stocProdus;
    }

    public void setStocProdus(Integer stocProdus) {
        this.stocProdus = stocProdus;
    }

    public Integer getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(Integer pretProdus) {
        this.pretProdus = pretProdus;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    Integer pretProdus;
    String numeProdus;


}
