import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {

    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Δώσε το συνολικό ποσό(ακέραιος):");

            int amount = input.nextInt();

            System.out.println("Δώσε τον αριθμό των ατόμων:");

            int people = input.nextInt();

            System.out.println(amount/people);

        } catch ( ArithmeticException e){

            System.out.println("Σφάλμα , διαίρεση με μηδέν άτομα");

        } catch ( InputMismatchException e) {

            System.out.println("Σφάλμα , πρέπει να πληκτρολογηθεί μόνο ακέραιος αριθμός");

        }

        System.out.println("Η εφαρμογή λειτουργεί κανονικά");

    }
}
