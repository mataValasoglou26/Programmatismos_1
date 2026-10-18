package eduExercises;

public class Triangle extends Shape{

    private double mhkos;
    private double platos;

    public Triangle( String color, double mhkos,double platos){
        super(color);

        this.mhkos=mhkos;
        this.platos=platos;
    }


    public void setMhkos(double mhkos){
        this.mhkos=mhkos;
    }

    public double getMhkos(){
        return mhkos;
    }

    public void setPlatos(double platos){
        this.platos=platos;
    }

    public double getPlatos(){
        return platos;
    }

    @Override

    public String toString(){
        return super.toString() + " mhkos: "+getMhkos()+" platos: "+getPlatos();
    }

    @Override

    public double getArea(){
        return getMhkos()*getPlatos()/2;
    }
}
