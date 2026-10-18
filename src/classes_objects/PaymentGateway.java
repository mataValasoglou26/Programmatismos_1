package classes_objects;

public class PaymentGateway {

    public void processPayment( double amount ){

        System.out.println("basic payment:" + amount);
    }

    public void processPayment( double amount , String voucher) {

        System.out.println("payment: " + amount + "with voucher: " + voucher);

    }

    public void processPayment( double amount , int installments ) {

        double installmentAmount = amount / installments;
        System.out.println( "each istallment: " + installmentAmount);
    }
}
