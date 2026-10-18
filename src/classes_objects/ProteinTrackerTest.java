package classes_objects;

public class ProteinTrackerTest {

    public static void main ( String[] args ){

        ProteinTracker myMacros = new ProteinTracker();

        myMacros.addProteinGrams(20.8);
        myMacros.addProteinGrams(55.7);
        myMacros.addProteinGrams(44.6);

        System.out.printf("your protein for the day is: %.2f grams.\n", myMacros.getCurrentProtein());
        System.out.println("keep going");
    }
}
