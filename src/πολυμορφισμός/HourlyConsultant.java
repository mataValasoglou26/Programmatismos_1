package πολυμορφισμός;

public class HourlyConsultant extends Consultant{

    private double hourlyRate;
    private int hoursWorked;

    public HourlyConsultant( String name , double hourlyRate , int hoursWorked ){

        super(name);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }

    @Override

    public double calculatePay(){

        return hoursWorked*hourlyRate;

    }
}
