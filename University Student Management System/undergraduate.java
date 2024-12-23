public class undergraduate extends Student {
    private int testScore;

    public undergraduate(String studentNo, String studentName, int meritPoints, int testScore){
        super(studentNo, studentName, meritPoints);
        this.testScore = testScore;
    }

    public double CalculateMerit(double merit){
        merit = merit + testScore;
        return merit;
    }

    public String toString() {
        return super.toString() + "TestScore = " + testScore + "\n";
    }
}