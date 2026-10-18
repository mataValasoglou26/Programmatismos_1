package πολυμορφισμός;

public class CompanyApp {

    public static void main ( String[] args ){

        Employee emp1 = new SalariedEmployee("Mata" , 100000);

        System.out.println(emp1.earnings());

        Employee emp2 = new HourlyEmployee("Kostas",5000.6,80.9);

        System.out.println(emp2.earnings());

        //χρήση array για πολλούς υπαλληλους μαζί, δηλαδή χωρίς τη χρήση του println

        Employee[] staff = new Employee[2];

        staff[0] = emp1;
        staff[1] = emp2;

        for( Employee persons : staff ) {
            System.out.println(persons.earnings());
        }

        //Εναλλακτικά

        for( int i=0; i< staff.length; i++ ) {
            System.out.println(staff[i].earnings());
        }
    }
}
