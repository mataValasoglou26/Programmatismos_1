package eduExercises;
import java.util.Scanner;
public class EmployeeTest {

   public static void main(String[] args){

       Employee emp1 = new Employee("Mata",100.5);
       Employee emp2 = new Employee("Kostas",200.3);

      Order o1 = new Order(emp1.getCode(),260);
      Order o11 = new Order(emp1.getCode(),260);
      Order o111 = new Order(emp1.getCode(), 260);
      Order o1111 = new Order(emp1.getCode(),260);
      Order o2 = new Order(emp2.getCode(), 1001);
      Order o22 = new Order(emp2.getCode(),1002);
      Order o222 = new Order(emp2.getCode(),20220);

      Scanner input = new Scanner(System.in);
      boolean flag=true;

      do{
          System.out.println("menu:");
          System.out.println("1: print employees");
          System.out.println("2: insert new employee");
          System.out.println("3:increase 10% the salary of employees with more than 2 orders and over 1000$");
          System.out.println("-1: exit");
          System.out.println("whats your choice;");
          int choice = input.nextInt();
          input.nextLine();

          if( choice==1){
              for(Employee allEmp : Employee.employeeArray) {
                  System.out.println(allEmp);
              }
          } else if (choice==2){
              System.out.println("name and double salary");
              String name = input.nextLine();
              Double salary = input.nextDouble();
              Employee emp = new Employee(name,salary);
          }else if(choice==3){
              for( Employee eachEmp : Employee.employeeArray){
                  if(eachEmp!=null) {
                      int counter = 0;
                      int test = eachEmp.getCode();
                      for (Order eachOrder : Order.orderArray) {
                          if(eachOrder != null) {
                              double am = eachOrder.getAmount();
                              if (test == eachOrder.getEmployee_code() && am > 1000) {
                                  counter = counter + 1;
                              }
                          }
                      }
                      if (counter > 2) {

                          eachEmp.setMonthlySalary(eachEmp.getMonthlySalary() * 110 / 100);

                      }
                  }
              }
          }else if(choice==-1){
              flag=false;

          }
      }while(flag);
   }
}
