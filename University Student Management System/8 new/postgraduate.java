public class postgraduate extends student {
    private double gpa;

    public postgraduate(String studentName, String studentNo, int meritPoints, double gpa){
        super(studentName,studentNo,meritPoints);
        this.gpa=gpa;
    }

    public double getGPA(){
        return getGPA();
    }

    public void setGPA(double Gpa){
        gpa=Gpa;
    }

    public  double calMerit(){
        return super.getMeritPoints()+gpa;
    }

    public String toString(){
        return super.toString()+" Gpa is "+gpa+" Total merit of undergraduate is "+calMerit();
    }
}
