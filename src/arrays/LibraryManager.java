package arrays;
import java.util.ArrayList;

public class LibraryManager {

    public static void main (String[] args) {

        ArrayList<String> readingList = new ArrayList<String>();

        readingList.add("fourth wing");
        readingList.add("acotar");
        readingList.add("throne of glass");
        readingList.add("iron flame");

        System.out.println("the list has:" + readingList.size()+ " books");

        readingList.remove("acotar");
        readingList.add("onyx storm");

        for (String book : readingList ) {
            System.out.println("-" + book );
        }
    }

}
