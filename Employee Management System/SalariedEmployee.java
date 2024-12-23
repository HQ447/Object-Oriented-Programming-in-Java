public class SalariedEmployee extends Employee{
   private double TotalSalary;

    public SalariedEmployee(String f_Name, String l_Name, String SSN,double TotalSalary) {
        super(f_Name, l_Name, SSN);
        this.TotalSalary=TotalSalary;
    }

    public double getTotalSalary() {
        return TotalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        TotalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return super.toString()+"SalariedEmployee{" +
                "TotalSalary=" + TotalSalary +
                '}';
    }
}
