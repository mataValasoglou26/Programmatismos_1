import java.util.Random;

public class DemandSimulator {

    public static void main ( String[] args ) {

        Random number = new Random();

        //η nextInt(41) βγαζει τυχαιους αριθμους 0-40 αν προσθεσουμε 10 το ευρος γινεται 10-50
        int dailyDemand = 10 + number.nextInt(41);

        // company makes minimum 20 pieces
        int safetyStock = 20;

        int production = Math.max(safetyStock , dailyDemand );
            System.out.println(production);

        if ( production < safetyStock ) {
            System.out.println( "demand smaller than safety");
        }


    }


}
