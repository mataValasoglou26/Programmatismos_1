package arrays;

public class RouteManager {
    public static void main(String[] args){

        Stop[] destination = new Stop[3];

        destination[0] = new Stop("chania");
        destination[1] = new Stop("paros");
        destination[2] = new Stop("poros");

        for ( Stop place : destination ) {
            System.out.println("next destination: " + place.getLocation());
        }
    }
}
