import java.util.Scanner;
public class BasgiathCollege {
    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("how old are you,candidate?");

        int age = input.nextInt();

        if (age < 20) {
            System.out.println("too young");
        } else if (age > 25) {
            System.out.println("too old");
        } else {
            System.out.println("Welcome to Basgiath! Do you want to go in the Scribe Quadrant (1) or the Riders Quadrant (2);");
            int quadrant = input.nextInt();

            if (quadrant == 1) {
                System.out.println("welcome!");
            } else if (quadrant == 2) {
                System.out.println("hmmm a rider!How many hours a week do you train;");
                int hours = input.nextInt();

                if (hours >= 10) {
                    System.out.println("you might survive!");
                } else {
                    System.out.println("death is close");
                }
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
