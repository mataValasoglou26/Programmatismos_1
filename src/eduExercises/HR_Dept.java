package eduExercises;

public class HR_Dept extends Department{

    private int counter=0;

    Employee1[] hrArray = new Employee1[10];

    public HR_Dept(String name){

        super(name);

    }

    public void addEmployee(Employee1 emp){
        hrArray[counter] = emp;

        counter = counter +1;
    }

    @Override

    public void printEmployees(){
        for(Employee1 emp1 : hrArray){
            if(emp1!=null){
                System.out.println(emp1);
            }
        }
    }


}
