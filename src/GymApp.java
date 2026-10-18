public class GymApp {


    public static void main(String[] args){

        WorkoutDate date = new WorkoutDate(16,9);

        GymSession session = new GymSession("βάρη και διάδρομος",date);

        session.printSession();
    }
}
