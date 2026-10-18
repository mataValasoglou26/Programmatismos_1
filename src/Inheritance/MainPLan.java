package Inheritance;

public class MainPLan {

    public static void main ( String[] args ){

        BusinessPlan plan = new BusinessPlan("Enterprise",50.0,10);

        System.out.println(plan);

        System.out.println(plan.calculateTotal());
    }
}
