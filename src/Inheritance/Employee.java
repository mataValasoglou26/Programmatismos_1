package Inheritance;

public class Employee {

    private String name;
    protected double salary;

    public Employee( String name , double salary ){

        this.name = name;
        this.salary = salary;
    }

    public String toString(){

        return "employee: " + name + "|" +" Salary: " + salary;
    }
}
