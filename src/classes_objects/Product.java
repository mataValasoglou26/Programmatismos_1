package classes_objects;

public class Product {

    private String name;
    private int stock;
    private double price;

    public Product( String productName , double productPrice , int productStock) {
        name = productName;
        if ( productPrice >= 0 ) {
            price = productPrice;
        }
        if ( productStock > 0 ) {
            stock = productStock;
        }
    }

    public void sell ( int quantity ) {
        if ( quantity>0 && quantity <= stock ) {
            stock = stock - quantity;
                double totalCost = quantity * price;
                    System.out.println("your total cost is:" + totalCost);
        } else {
            System.out.println("wrong input");
        }
    }

    public String getProductName() {
        return name;
    }

    public int getProductStock() {
        return stock;
    }
}
