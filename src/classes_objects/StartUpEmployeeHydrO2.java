package classes_objects;

public class StartUpEmployeeHydrO2 {

    public static void main(String[] args ){

        System.out.println( "αρχικοσ αριθμος υπαλληλων: " + StartUpEmployee.getTotalTeamSize());

        StartUpEmployee employee1 = new StartUpEmployee("Alex","ceo");
        StartUpEmployee employee2 = new StartUpEmployee("Jhonny","manager");
        StartUpEmployee employee3 = new StartUpEmployee("Maria","cleaner");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("τελικο υπολοιπο εργαζομενων : " + StartUpEmployee.getTotalTeamSize());
    }
}
