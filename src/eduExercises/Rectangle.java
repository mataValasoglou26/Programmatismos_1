package eduExercises;

public class Rectangle extends Shape {

    private double mhkos;
    private double platos;

    public Rectangle( String color, double mhkos , double platos){

        super ( color );

        this.mhkos=mhkos;
        this.platos=platos;
    }

    public void setMhkos(double mhkos){
        this.mhkos=mhkos;
    }

    public double getPlatos(){
        return platos;
    }

    public void setPlatos(double platos){
        this.platos=platos;
    }

    public double getMhkos(){
        return mhkos;
    }

    @Override

    public String toString(){
        return super.toString() + " mhkos: "+getMhkos()+" platos: "+getPlatos();
    }

    @Override

    public double getArea(){
        return getMhkos()*getPlatos();
    }
}
