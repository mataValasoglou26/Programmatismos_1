package eduExercises;

public class Main {

    public static void main ( String[] args ) {

        Company comp = new Company("AUEB");

        IT_Dept it = new IT_Dept("Tech Support");

        HR_Dept hr = new HR_Dept("human resources");

        Employee1 emp1 = new Employee1("mata", 1);
        Employee1 emp2 = new Employee1("kostas", 2);
        Employee1 emp3 = new Employee1("maria", 3);
        Employee1 emp4 = new Employee1("pavlos", 4);

        it.addEmployee(emp1);
        it.addEmployee(emp2);
        hr.addEmployee(emp3);
        hr.addEmployee(emp4);

        comp.addDepartment(it);
        comp.addDepartment(hr);

        comp.printAll();
    }
}
