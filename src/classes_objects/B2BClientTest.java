package classes_objects;
import java.util.Scanner;

public class B2BClientTest {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("whats your hospital's name;");

        String name = input.nextLine();

        B2BClient client = new B2BClient(name);

        System.out.println("how much oxygen do you need;");
         double oxygen = input.nextDouble();
         client.addOrder(oxygen);

         client.orderCost(123.5);


    }
}
