package πολυμορφισμός;

public class ConsultantTest {

    public static void main(String[] args) {

        Consultant[] arrayConsultant = new Consultant[2];

        ProjectConsultant c1 = new ProjectConsultant("mata", 20.9);

        HourlyConsultant c2 = new HourlyConsultant("maria", 45.8, 40);


        arrayConsultant[0] = c1;
        arrayConsultant[1] = c2;

        for (Consultant people : arrayConsultant) {
            System.out.println(people.calculatePay());
        }
    }
}