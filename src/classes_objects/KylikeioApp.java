package classes_objects;

import java.util.Scanner;

public class KylikeioApp {

    public static void main( String[] args ) {

        Product item = new Product("Freddo Espresso",1.80,10);

        System.out.println("how many freddo espresso do you want;");

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        item.sell(choice);

        System.out.println("Done for today");
        System.out.println("remaining " + item.getProductName() + ": " + item.getProductStock());
    }

}
