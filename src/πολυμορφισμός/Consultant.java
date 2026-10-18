package πολυμορφισμός;

public abstract class Consultant {

    private String name;

    public Consultant( String name ){

        this.name = name;
    }

    public abstract double calculatePay();
}
