package classes_objects;

import java.util.Random;

public class bookNumber {

    public static void main ( String[] args ) {

        Random bookCount = new Random();

        System.out.println("how many books do you want to buy; ");

        int dream = bookCount.nextInt(201);

        System.out.println(dream);

        int reality = 5;

        System.out.println("you can afford: " + reality + "books");

    }
}
