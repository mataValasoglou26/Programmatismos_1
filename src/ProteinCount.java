import java.util.Scanner;
public class ProteinCount {
    public static void main( String[] args) {

        System.out.println("how much protein do you need;");

        Scanner input = new Scanner(System.in);

        int protein = input.nextInt();

        if (protein >= 130 && protein <= 150){
            System.out.println("good job!");
        } else {
            System.out.println("no protein no muscles!");
        }

    }
}
