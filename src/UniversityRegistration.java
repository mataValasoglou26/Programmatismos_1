public class UniversityRegistration {

    private String studentName;
    private final String studentId;

    public UniversityRegistration( String studentName , String studentId){

        this.studentId = studentId;
        this.studentName = studentName;

    }

    public void setStudentName(String name){

        this.studentName = name;
    }

    public String toString(){

        return "AM: " + studentId + " student: " + studentName;
    }
}
