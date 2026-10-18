package classes_objects;

import java.util.Scanner;

public class PizzaOrderTest {

    public static void main ( String[] args) {

        Scanner input = new Scanner ( System.in );

        PizzaOrder myOrder = new PizzaOrder();

        System.out.println("what pizza do you want to order?");

        String pizzaName = input.nextLine();

        myOrder.hereIsYourPizza( pizzaName );
    }
}
