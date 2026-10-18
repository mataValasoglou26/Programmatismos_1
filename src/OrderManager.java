public class OrderManager {

    public enum OrderStatus { PENDING , PROCESSING , SHIPPED , DELIVERED };

    public static void main ( String[] args ) {


        OrderStatus current = OrderStatus.SHIPPED;

        switch (current) {
            case PENDING:
                System.out.println("pending");
                break;
            case PROCESSING:
                System.out.println("processing");
                break;
            case SHIPPED:
                System.out.println("shipped");
                break;
            case DELIVERED:
                System.out.println("delivered");
                break;
            default:
                System.out.println("status unknown");
                break;

        }
    }
}
