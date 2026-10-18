package classes_objects;

public class B2BClient {

    private String hospitalName;
    private double totalOxygenLitters;

    public B2BClient( String name ) {
        hospitalName = name;
        totalOxygenLitters = 0.0;
    }

    public void addOrder ( double moreOxygen) {
        if ( moreOxygen > 0 ) {
            totalOxygenLitters = totalOxygenLitters + moreOxygen;

        } else {
            System.out.println("error");
        }
    }

    public String getHospitalName ( String name ){
        return hospitalName;
    }

    public void orderCost ( double pricePerLitter ){
        double totalCost = totalOxygenLitters * pricePerLitter;

                System.out.println("You ordered:" + totalOxygenLitters + " " + "your total is:" + totalCost );
                System.out.println("for:" + hospitalName);
    }
}
