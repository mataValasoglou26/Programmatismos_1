package eduExercises;

public class Health extends Insurance{

    protected static int counter = 0;
    protected double maxCost;

    protected static Health[] healthArray = new Health[10];

    public Health ( int costumerId , int timeFrame , double maxCost){
        super(costumerId,timeFrame);

        this.maxCost = maxCost;

        healthArray[counter] = this;
        counter = counter + 1;
    }

    public void setMaxCost(double maxCost){
        this.maxCost = maxCost;
    }

    public double getMaxCost(){
        return maxCost;
    }

    @Override

    public String toString(){
        return super.toString()+ " maxCost: "+maxCost;
    }

    @Override
    public double calculateCost(){
        int age = 0 ;
        boolean flag=false;
        for(int i =0;i<Costumer.costumerArray.length;i++){
            if(Costumer.costumerArray[i]!=null && Costumer.costumerArray[i].getId()==costumerId){
                age=2026-Costumer.costumerArray[i].getDateOfBirth();
            }
            //1=man,2=woman
            if(Costumer.costumerArray[i]!=null && Costumer.costumerArray[i].getSex()==1){
                flag=true;
            }
        }
        if(flag) {
            return super.calculateCost() + (7 * age) + 50;
        }else{
            return super.calculateCost() + ( 7 * age );
        }
    }
}
