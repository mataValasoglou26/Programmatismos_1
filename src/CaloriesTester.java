public class CaloriesTester {
    public static void main (String[] args){
        int calorie = 1865;
        System.out.println(calorie);

        String goalStatus = ( calorie>1700 && calorie<2000 )? "goal achieved" : "goal not achieved";

                System.out.println(goalStatus);
    }
}
