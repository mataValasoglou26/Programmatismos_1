package arrays;

public class FitnessPal {

    public static double getAverageProtein( int[] dailyProtein ){
        int total = 0;

        for ( int i = 0; i < dailyProtein.length; i++){
            total = total + dailyProtein[i];
        }

        return (double) total/dailyProtein.length;
    }

    public static void main(String[] args){
        int[] dailyProteinGrams = { 115, 130, 125, 140, 150, 110, 135 };
        //h static den xreiazetai antikeimeno gia na thn kalesw
        double average = getAverageProtein(dailyProteinGrams);
        System.out.println(average);
        if ( average>=100 && average<=150 ){
            System.out.println("good job");
        }else {
            System.out.println("protein error");
        }
    }
}
