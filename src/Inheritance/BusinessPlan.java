package Inheritance;

public class BusinessPlan extends CloudPlan{

    private int extraLicense;

    public BusinessPlan( String planName , double basePrice , int extraLicense){

        super ( planName,basePrice);

        this.extraLicense = extraLicense;
    }

    public double calculateTotal(){
        return basePrice + 5.0*extraLicense;
    }

    @Override

    public String toString(){
        return super.toString() + " | Epipleon Xrhstes: " + extraLicense;
    }

}
