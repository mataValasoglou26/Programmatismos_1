package eduExercises;

public class Company {

    private String name;

    private int counter=0;
    Department[] dep = new Department[4];

    public Company(String name){
        this.name=name;
    }

    public void addDepartment(Department d){
        dep[counter]=d;

        counter = counter + 1;
    }

    public void printAll(){
        for( Department x : dep){
            if(x!=null){
                x.printEmployees();
            }
        }
    }
}
