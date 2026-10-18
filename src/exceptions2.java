import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptions2 {

    public static int calculateItems ( int items , int boxes ) throws ArithmeticException {

        return items / boxes;

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean flag = true;

        do{
            try{
                System.out.println("total number of items :");
                int items = input.nextInt();

                System.out.println("total number of boxes: ");
                int boxes = input.nextInt();

                System.out.println(calculateItems(items,boxes));

                flag = false;

            }catch ( ArithmeticException e ) {

                System.out.println("διαιρεση με μηδεν κιβωτια");

            } catch ( InputMismatchException e ) {

                System.out.println("εισαγεται μονο αριθμους");
                input.nextLine();
            }
        }while(flag);

        System.out.println("h diadikasia oloklirothike");


    }
}
