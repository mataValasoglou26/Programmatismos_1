package Inheritance;

public class Subscription extends DigitalItem{


    private int durationInMonths;

    public Subscription( String title , double basePrice , int durationInMonths){

        super( title , basePrice);

        this.durationInMonths = durationInMonths;
    }

    public double calculateCost(){
        return  durationInMonths*basePrice;
    }


}
