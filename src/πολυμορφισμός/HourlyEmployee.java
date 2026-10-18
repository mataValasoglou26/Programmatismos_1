package πολυμορφισμός;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee( String name , double wage , double hours){

        super( name );

        this.wage = wage;
        this.hours = hours;

    }

    @Override

    public double earnings(){
        if ( hours <= 40 ){
            return wage*hours;
        } else {
            return wage*40 + ( hours - 40 )*wage*1.5;
        }
    }


}
