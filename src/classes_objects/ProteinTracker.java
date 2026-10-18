package classes_objects;

public class ProteinTracker {

    private double currentProtein;

    public ProteinTracker() {

        currentProtein = 0.0;
    }

    public void addProteinGrams ( double grams ) {

        if ( grams > 0.0 ) {
            currentProtein = currentProtein + grams;
        }

    }

    public double getCurrentProtein() {

        return currentProtein;
    }
}

