package Inheritance;

public class CloudPlan {

    private String planName;
    protected double basePrice;

    public CloudPlan( String planName , double basePrice){

        this.planName = planName;
        this.basePrice = basePrice;

    }

    public String toString(){
        return "paketo: " + planName + " | Basikh Timh: " + basePrice;
    }
}
