package eduExercises;

public class Employee {
    private String name;
    private int code;
    private double monthlySalary;
    private static int counterEmployee=0;

    static Employee[] employeeArray = new Employee[10];

    public Employee(String name,double monthlySalary){
        this.name=name;
        this.monthlySalary=monthlySalary;
        this.code=counterEmployee+1;

        employeeArray[counterEmployee]=this;

        counterEmployee=counterEmployee+1;

    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary=monthlySalary;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public void setCode(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }

    public String toString(){
        return "name: "+name+" code: "+code+" salary: "+monthlySalary;
    }
}
