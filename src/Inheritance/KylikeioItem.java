package Inheritance;

public class KylikeioItem {

    private String itemName;
    protected double basePrice;

    public KylikeioItem( String itemName , double basePrice ){

        this.itemName = itemName;
        this.basePrice = basePrice;
    }

    public String toString(){

        return "product: "+ itemName + " base price: " + basePrice;

    }
}
