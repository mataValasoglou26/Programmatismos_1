package eduExercises;

public abstract class Department {
    private String name;

    public Department(String name){
        this.name=name;
    }

    public abstract void printEmployees();

}
