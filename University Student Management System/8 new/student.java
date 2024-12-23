import java.sql.Date;

public class student{
    private String studentName;
    private String studentNo;
    private int meritPoints;
    private int noOfStudents=0;

    public student(){
        studentName="not know";
        studentNo="not know";
        meritPoints=20;
        noOfStudents++;
    }

    public student(String name,String id,int points){
        this.studentName=name;
        this.studentNo=id;
        this.meritPoints=points;

        noOfStudents++;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName=name;
    }
    public String getStudentNo(){
        return studentNo;
    }

    public void setStudentNo(String id){
        studentNo=id;
    }
    public int getMeritPoints(){
        return meritPoints;
    }

    public void setMeritPoints(int points){
        meritPoints=points;
    }



    public String toString(){
        return String.format("Student Name =%s%n Student ID = %s%n Merit Points = %d%n", studentName,studentNo,meritPoints);
    }

}