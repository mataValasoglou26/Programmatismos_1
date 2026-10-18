package arrays;

public class Kylikeio {

    public static void main(String[] args){

        Product[] products = new Product[3];

        products[0] = new Product("kafes",1.80);
        products[1] = new Product("tost", 1.20);
        products[2] = new Product("mpara", 1.50);

        double totalValue = 0.0;

        System.out.println("MENU ITEMS: ");

        for ( Product item : products ){
            totalValue = totalValue + item.getPrice();

            System.out.println("-" + item.getName() + ": " + item.getPrice());

        }

        System.out.println(totalValue);
    }
}
