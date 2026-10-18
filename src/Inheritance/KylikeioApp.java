package Inheritance;

public class KylikeioApp {

    public static void main ( String[] args ) {

        CoffeeOrder order = new CoffeeOrder("freddo",2.0,0,true);

        System.out.println(order);
        System.out.println(order.getPrice());
    }
}
