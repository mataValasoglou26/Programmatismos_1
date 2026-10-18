package arrays;

public class GradeAnalyzer {

    public static double getAverage ( int[] setOfGrades ) {
        int total = 0;

        for ( int i = 0; i < setOfGrades.length; i++ ) {
            total = total + setOfGrades[i];
        }

        return (double) total/setOfGrades.length;
    }

    public static void main(String[] args){

        int[] classGrades = { 23, 54, 88, 100, 99, 34 };

        double classAverage = getAverage(classGrades);
        System.out.println("class average: " + classAverage);

    }
}


