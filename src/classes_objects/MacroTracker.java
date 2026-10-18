package classes_objects;

public class MacroTracker {

    private int dailyCalories;

    public void setDailyCalories ( int calories ) {

        if ( calories > 0 ) {

            dailyCalories = calories;
            System.out.println(" επιτυχής καταχώριση ");

        } else {

            System.out.println(" ανεπιτυχης καταχωριση ");

        }
    }

    public int getDailyCalories() {

        return dailyCalories;
    }
}
