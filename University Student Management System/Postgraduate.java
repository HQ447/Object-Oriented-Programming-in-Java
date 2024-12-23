public class Postgraduate extends Student {
    private double GPA;

    public Postgraduate(String studentNo, String studentName, int meritPoints, double GPA){
        super(studentNo, studentName, meritPoints);
        this.GPA = GPA;
    }

    public double CalculateMerit(double merit){
        merit = merit + GPA;
        return merit;
    }

    public String toString() {
        return super.toString() + "GPA = " + GPA + "\n";
    }
}
