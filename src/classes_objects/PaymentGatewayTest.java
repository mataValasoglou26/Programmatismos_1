package classes_objects;

public class PaymentGatewayTest {

    public static void main ( String[] args) {

        PaymentGateway gateway = new PaymentGateway();

        gateway.processPayment(50);
        gateway.processPayment(3456, "aueb voucher");
        gateway.processPayment(34568,9);
    }
}
