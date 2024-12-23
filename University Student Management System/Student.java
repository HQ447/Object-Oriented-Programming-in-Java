public class Student {
    private String studentNo;
    private String studentName;
    private int meritPoints;
    private static int noOfStudents = 0;

    public Student(){
        this.studentNo = "not known";
        this.studentName = "not known";
        this.meritPoints = 20;
        noOfStudents++;
    }

    public Student(String studentNo, String studentName, int meritPoints) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.meritPoints = meritPoints;
        noOfStudents++;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMeritPoints() {
        return meritPoints;
    }

    public void setMeritPoints(int meritPoints) {
        this.meritPoints = meritPoints;
    }

    public static int getNoOfStudent(){
        return noOfStudents;
    }

    public String toString() {
        return String.format("StudentNo = %s%nStudentName = %s%nMeritpoint = %s%n", studentNo, studentName, meritPoints);
    }
}
