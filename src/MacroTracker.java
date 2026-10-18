import java.util.Scanner;

public class MacroTracker {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int totalCalories = 0;

        while ( totalCalories < 1700 ){

            System.out.println("whats your next meal;");

            int calories = input.nextInt();

                while ( totalCalories + calories > 1700) {
                    System.out.println("try something smaller");
                     int newCalories = input.nextInt();
                     calories = newCalories;
                }

            totalCalories = totalCalories + calories ;

            System.out.println("up until now:" + totalCalories );

        }

        System.out.println("done for today!");
    }
}
