package classes_objects;

public class BankAccountTest {

    public static void main (String[] args){

        BankAccount emp1 = new BankAccount("Mata", 500);
        BankAccount emp2 = new BankAccount("Georgia");
        System.out.println(emp1.getAccountHolder() + emp1.getBalance());
        System.out.println(emp2.toString());
    }
}
