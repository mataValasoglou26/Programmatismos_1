package Inheritance;

public class ShopApp {

    public static void main ( String[] args ) {

        Subscription item = new Subscription("premium software" , 15.0 , 12);

        System.out.println(item.calculateCost());


    }
}
