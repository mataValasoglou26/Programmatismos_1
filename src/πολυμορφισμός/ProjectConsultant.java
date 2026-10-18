package πολυμορφισμός;

public class ProjectConsultant extends Consultant{

    private double projectFee;

    public ProjectConsultant( String name , double projectFee){

        super( name );

        this.projectFee = projectFee;
    }

    @Override

    public double calculatePay(){

        return projectFee;

    }
}
