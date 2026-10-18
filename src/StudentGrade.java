public class StudentGrade {

    private String studentName;
    private double grade;

    public void setGrade(double grade){
        if(grade>=0.0 && grade<=10.0){
            this.grade=grade;
        }else{
            System.out.println("wrong input");
        }
    }

    public double getGrade(){
        return grade;
    }
//όταν καλώ μέθοδο μιας κλάσης μέσα στην ίδια την κλάση δεν χρησιμοποιώ αντικείμενω απλα το όνομα της μεθόδου.
    public StudentGrade(String studentName , double grade){
        this.studentName = studentName;
        setGrade(grade);
    }
}
