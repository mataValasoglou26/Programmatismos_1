package eduExercises;

public class Employee1 {
    private String name;
    private int id;

    public Employee1( String name , int id ){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "name: " + getName() + " id: " + getId();
    }
}
