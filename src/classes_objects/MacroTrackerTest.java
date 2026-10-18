package classes_objects;

public class MacroTrackerTest {
    public static void main ( String[] args) {

        MacroTracker myTracker = new MacroTracker();

        myTracker.setDailyCalories(2000);

        System.out.println(" οι θερμιδες σου:" + myTracker.getDailyCalories());
    }
}
