package types;

public class ProdusAlimentar {
    private String numeProdus;
    private Integer stocProdus;
    private Integer pretProdus;


    public ProdusAlimentar(String numeProdus, Integer pretProdus, Integer stocProdus){
        this.stocProdus=stocProdus;
        this.numeProdus=numeProdus;
        this.pretProdus=pretProdus;

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
