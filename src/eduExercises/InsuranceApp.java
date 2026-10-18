package eduExercises;
import  java.util.Scanner;
public class InsuranceApp {
    public static void main (String[] args){
        System.out.println("MENU:");
        System.out.println("1.Print all Insurances");
        System.out.println("2.Print insurances of a costumer with his code");
        System.out.println("3.Print insurance kind with her code");
        System.out.println("-1:exit");

        System.out.println("whats your choice;");
        Scanner input = new Scanner(System.in);

        boolean flag=true;

        do{
            int choice = input.nextInt();
            if(choice==1){
                for(int i = 0; i<10; i++){
                    System.out.println("Health Insurance:");
                    System.out.println(Health.healthArray[i]);
                    System.out.println("Life Insurance:");
                    System.out.println(Life.lifeArray[i]);
                }
            } else if(choice==2){
                System.out.println("whats your code;");
                int code = input.nextInt();
                for(int i = 0; i<10; i++){
                    if(Insurance.insurancesArray[i]!=null && Insurance.insurancesArray[i].getCostumerId()==code){
                        System.out.println("Insurance for costumer with code: " + code);
                        System.out.println(Insurance.insurancesArray[i]);
                    }
                }
            }else if(choice==3){
                System.out.println("Whats your insurance's code");
                int code2 = input.nextInt();
                for(int i = 0; i<10; i++){
                    if(Insurance.insurancesArray[i].getSecurityCode()==code2 && Insurance.insurancesArray[i].getSecurityCode()!=0){
                        System.out.println("Insurance with code: " + code2 );
                        System.out.println(Insurance.insurancesArray[i].toString());
                    }
                }


            }else if(choice==-1){
                flag=false;
            }

        }while(flag);

    }
}
