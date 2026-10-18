package arrays;

public class DailyOrdersArray {

    public static void main(String[] args){

        int[] dailyOrders = { 32, 27, 64, 18, 95, 14, 90 };

        System.out.println("Αναφορά Παραγγελειών");

        for( int counter = 0; counter < dailyOrders.length; counter++) {
            System.out.println( "Μέρα:" + (counter+1) + "Παραγγελείες:" + dailyOrders[counter]);
        }
    }
}
