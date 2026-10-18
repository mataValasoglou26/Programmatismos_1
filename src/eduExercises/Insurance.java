package eduExercises;

public class Insurance {

    protected int costumerId;
    protected int securityCode;
    protected int timeFrame;

    protected static int counter = 0;

    protected static Insurance[] insurancesArray = new Insurance[10];

    public Insurance( int costumerId , int timeFrame ){

        this.costumerId = costumerId;
        this.timeFrame = timeFrame;

        this.securityCode = counter + 1;

        insurancesArray[counter] = this;

        counter = counter + 1;
    }

    public String toString(){
        return " costumer's id: " + costumerId + " security code: "+securityCode+" until: "+timeFrame;
    }

    public double calculateCost(){
        return 100;
    }

    public void printAllInsurances(){
        for( Insurance each : insurancesArray){
            if( each!=null){
                System.out.println(each);
            }

        }
    }

    public int getSecurityCode(){
        return securityCode;
    }

    public int getCostumerId(){
        return costumerId;
    }

    public void printOneInsurance( int securityCode ){
        for( Insurance each : insurancesArray ){
            if( securityCode==each.getSecurityCode() && each!= null){
                System.out.println(each);
            }else{
                System.out.println("no costumer found");
            }
        }
    }
}
