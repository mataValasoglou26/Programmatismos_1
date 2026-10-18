package Inheritance;

public class CoffeeOrder extends KylikeioItem{

    private int sugarDose;
    private boolean hasExtraShot;

    public CoffeeOrder( String itemName , double basePrice , int sugarDose , boolean hasExtraShot ){

        super( itemName , basePrice);

        this.sugarDose = sugarDose;
        this.hasExtraShot = hasExtraShot;

    }

    public double getPrice(){

        if ( hasExtraShot == true)  {
            return basePrice+0.50;
        } else {
            return basePrice;
        }
    }

    @Override

    public String toString(){

      return super.toString() + " sugar: " + sugarDose + " extra shot: " + hasExtraShot;

    }
}
