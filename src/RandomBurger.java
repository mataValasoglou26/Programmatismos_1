import java.util.Scanner;

import java.util.Random;

public class RandomBurger {

    public static void main ( String[] args ) {

        System.out.println("how many burgers do you want?");

        Scanner input = new Scanner(System.in);

        int burger = input.nextInt();

        Random number = new Random();

        System.out.println("Let's test your luck!");

        int finalBurgerNumber = number.nextInt(burger + 1 );

        System.out.println(finalBurgerNumber);
    }

}
