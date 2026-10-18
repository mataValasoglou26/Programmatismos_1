package eduExercises;

public class Order {
    private int code;
    private int employee_code;
    private double amount;

    static Order[] orderArray = new Order[10];

    static int counterOrder = 0;

    public Order(int employee_code,double amount){
        this.employee_code=employee_code;
        this.amount=amount;
        this.code=counterOrder+1;
        orderArray[counterOrder]=this;
        counterOrder=counterOrder+1;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void setEmployee_code( int employee_code ){
        this.employee_code=employee_code;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public int getCode(){
        return code;
    }
    public int getEmployee_code(){
        return employee_code;
    }
    public double getAmount(){
        return amount;
    }

    public String toString(){
        return "code: "+code+" employee_code: "+employee_code+" amount: "+amount;
    }
}
