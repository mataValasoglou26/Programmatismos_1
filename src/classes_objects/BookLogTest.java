package classes_objects;

import java.util.Scanner;

public class BookLogTest {

    public static void main ( String[] args){

        Scanner input = new Scanner( System.in );

        BookLog myLog = new BookLog();

        System.out.println("what book are you reading?");

        String myTitle = input.nextLine();

        myLog.startReading( myTitle );
    }
}
