package eduExercises;

public class AllShapes {

    public static void main ( String[] args ){

        Shape s = new Shape("red");
        Rectangle r = new Rectangle("yellow",5.5,6.5);
        Triangle t = new Triangle("green",4.5,7.6);

        System.out.println(s);
        System.out.println(r);
        System.out.println(t);
    }
}
