package eduExercises;

public class IT_Dept extends Department{
    private int counter=0;
    Employee1[] itArray = new Employee1[5];

    public IT_Dept(String name){
        super(name);
    }

    public void addEmployee(Employee1 emp){

        itArray[counter]=emp;

        counter=counter+1;

    }

    @Override

    public void printEmployees(){
        for(Employee1 emp1 : itArray){
            if(emp1!=null){
                System.out.println(emp1);
            }
        }
    }
}
