package classes_objects;

import java.util.Scanner;

public class BookChoice {

    public static void main( String[] args ) {

         Scanner input = new Scanner( System.in );
         Book myBook = new Book();

         System.out.println("Do you like to read? yes (1) no (2)");
         int answer = input.nextInt();
         input.nextLine();


         if ( answer == 1 ) {

             System.out.println("which book do you want?");

            String myBookTitle = input.nextLine();
            myBook.myBookType( myBookTitle );

         } else {
             System.out.println("Goodbye then!");
         }
    }
}
