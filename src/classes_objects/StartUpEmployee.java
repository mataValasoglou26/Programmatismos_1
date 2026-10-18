package classes_objects;

public class StartUpEmployee {

    private String name;
    private String role;
    private static int totalTeamSize = 0;

    public StartUpEmployee( String name , String role){
        this.name = name;
        this.role = role;

        totalTeamSize = totalTeamSize + 1;
    }

    public static int getTotalTeamSize(){
        return totalTeamSize;
    }

    public String toString(){
        return "employee: " + name + " | " + "role: " + role;
    }

}
