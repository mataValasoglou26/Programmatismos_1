package classes_objects;
import java.util.Scanner;

public class BabyNameTest {

    public static void main( String[] args){

    System.out.println("have you picked a baby name; yes(1) or no(2)");

    Scanner input = new Scanner(System.in);

    int ans = input.nextInt();

    BabyName myBaby = new BabyName();

    if ( ans == 1 ) {

        myBaby.setBabyName( "mata " );

        System.out.println( myBaby.getBabyName() + "is a very nice name!" );

    }



    }
}
