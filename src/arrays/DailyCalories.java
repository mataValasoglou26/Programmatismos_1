package arrays;

public class DailyCalories {

    public static void main(String[] args){

        int[] dailyCalories = { 1500, 1800, 1400, 1600, 1345, 1958, 1570 };

        System.out.println("Your calories for the week:");

        for ( int i=0; i < dailyCalories.length; i++ ) {

            System.out.println("day: " + (i+1) + "calories: " + dailyCalories[i] );
        }

    }
}
