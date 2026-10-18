import java.util.Scanner;

public class MovieNight {

    public static void main (String[] arg){

        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println( "What should we do tonight?");
            System.out.println("See a romantic movie? (1)");
            System.out.println("See a sci-fi movie? (2)");
            System.out.println("See a mystery movie? (3)");
            System.out.println("Go to bed? (0)");

            choice = input.nextInt();

            if ( choice == 1 ) {
                System.out.println("Great i love romance!");
            } else if ( choice == 2) {
                System.out.println("Nice!");
            } else if ( choice == 3 ) {
                System.out.println("my favourite!");
            } else if ( choice == 0 ){
                System.out.println( "Good idea:)");
            } else {
                System.out.println("Try again:(");
            }

        } while ( choice != 0);
    }
}
