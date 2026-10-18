package classes_objects;

public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){

        this.accountHolder = accountHolder;
        this.balance = balance;

        System.out.println("Δημιουργήθηκε επιτυχώς λογαριασμός με αρχικό υπόλοιπο");

    }

    public BankAccount(String accountHolder){
        this(accountHolder,0.0);

        System.out.println("Δημιουργήθηκε επιτυχώς λογαριασμός με μηδενικό υπόλοιπο");

    }

    public String getAccountHolder(){

        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    //downcast : (String)
    public String toString(){
        return (String) accountHolder + "-" + (int) balance;
    }
}
