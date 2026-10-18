package classes_objects;

public class Student {

    private int myGrade;

    public void setMyGrade( int grade ) {

        if ( grade >= 0 && grade <= 10 ) {
            myGrade = grade;
        } else {
            System.out.println("ανεπιτυχής καταχώριση");
        }
    }

    public int getMyGrade() {
         return myGrade;
    }
}
