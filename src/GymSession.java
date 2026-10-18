public class GymSession {

    private String routineType;
    private WorkoutDate sessionDate;

    public GymSession( String routineType , WorkoutDate sessionDate){

        this.routineType = routineType;
        this.sessionDate = sessionDate;
    }

    public void printSession(){

        System.out.println(routineType);
        System.out.println(sessionDate.toString());
    }
}
