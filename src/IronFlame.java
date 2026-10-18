import java.util.Scanner;

public class IronFlame {

    public static void main ( String[] args){

        System.out.println("Let's go look for IronFlame!");

        Scanner input = new Scanner(System.in);

        boolean bookIsFound = false;

        for( int shelf = 1; shelf <= 10; shelf++ ) {


            System.out.println("is iron flame on this shelf? (1)yes , (0)no" );

            int found = input.nextInt();

            while ( found != 1 && found != 0) {

                System.out.println("Try again");

                 found = input.nextInt();

             }

            if ( found == 1 ) {
                bookIsFound = true;
                break;

            } else {
                System.out.println("maybe on the next one");
            }


        } if ( bookIsFound ) {

        System.out.println("Found it!");

        } else {
            System.out.println ("book not found");
        }


    }
}
