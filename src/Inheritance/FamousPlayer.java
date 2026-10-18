package Inheritance;

public class FamousPlayer extends PeopleOnTheField{

    private double salary;

    public FamousPlayer(double salary , String name , String ability){

        super(name,ability);

        this.salary = salary;
    }

    @Override

    public String toString(){
        return super.toString() + " with salary: " + salary;
    }
}
