package eduExercises;

public class Shape {

    private String color;

    public Shape( String color ){
        this.color = color;
    }

    public void setColor( String color ){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return "Color: " + color;
    }

    public double getArea(){
        System.out.println("shape unknown");
        return -1;
    }

}
