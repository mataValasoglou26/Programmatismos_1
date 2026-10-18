package eduExercises;

public class Life extends Insurance{

    protected double investment;
    protected static int counter = 0;

   protected static Life[] lifeArray = new Life[10];

    public Life( int costumerId , int timeFrame , int investment){

        super(costumerId,timeFrame);

        this.investment = investment;

        lifeArray[counter] = this;

        counter = counter + 1;
    }

    @Override

    public String toString(){
        return super.toString() + " investment: "+investment;
    }

    @Override

    public double calculateCost(){
        int age = 0;
        for( int i = 0; i<Costumer.costumerArray.length;i++ ) {

            if (Costumer.costumerArray[i].getId() == costumerId && Costumer.costumerArray[i] != null) {
                age = 2026-Costumer.costumerArray[i].getDateOfBirth();
            }
        }
        return super.calculateCost()+ ( 5 * age );
    }

}
