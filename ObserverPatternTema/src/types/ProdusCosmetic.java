package types;

public class ProdusCosmetic {
    public String numeProdus;
    public Integer stocProdus;
    public Integer pretProdus;


    public ProdusCosmetic(String numeProdus, Integer pretProdus, Integer stocProdus) {
        this.numeProdus = numeProdus;
        this.stocProdus = stocProdus;
        this.pretProdus = pretProdus;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public Integer getStocProdus() {
        return stocProdus;
    }

    public Integer getPretProdus() {
        return pretProdus;
    }
}

