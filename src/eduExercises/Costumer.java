package eduExercises;

public class Costumer {

    private int id;
    private static int counter = 0;
    private String nameOfCostumer;
    private int dateOfBirth;
    private int sex;

   public static Costumer[] costumerArray = new Costumer[10];

    public Costumer( String nameOfCostumer , int dateOfBirth , int sex){

        this.nameOfCostumer = nameOfCostumer;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;

        this.id = counter + 1;

        costumerArray[counter] = this;

        counter = counter + 1;
    }

    public void setNameOfCostumer(String nameOfCostumer){
        this.nameOfCostumer = nameOfCostumer;
    }

    public String getNameOfCostumer(){
        return nameOfCostumer;
    }

    public void setId( int id ){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setDateOfBirth( int dateOfBirth ){
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth(){
        return dateOfBirth;
    }

    public void setSex( int sex ){
        this.sex = sex;
    }

    public int getSex(){
        return sex;
    }

    public String toString(){
        return "costumer's name: "+getNameOfCostumer()+" date of birth: "+getDateOfBirth()+" id: "+getId()+" sex: "+getSex();
    }
}
