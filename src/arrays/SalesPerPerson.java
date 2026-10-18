package arrays;

public class SalesPerPerson {

    public static void main (String[] args) {

        int[][] sales = {
                {10, 15, 20, 25},
                {30, 35, 40, 45},
                {50, 55, 60, 65}
        };

        for(int row=0; row<sales.length; row++){
            System.out.println("ypallhlos: " + row );

            for(int col=0; col<sales[row].length; col++){
                System.out.println( ": " +sales[row][col]);
            }
        } System.out.println( );
    }
}
