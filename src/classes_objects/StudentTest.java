package classes_objects;

public class StudentTest {
    public static void main(String[] args){

        Student student1 = new Student();
        student1.setMyGrade(10);

        System.out.println("ο βαθμος σου:" + student1.getMyGrade() );
    }
}
