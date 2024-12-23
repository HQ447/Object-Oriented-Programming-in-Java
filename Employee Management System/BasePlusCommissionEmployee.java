public class BasePlusCommissionEmployee extends Employee{
    private static final double CommissionRate = 0.12;
    private final double BasicSalary=20000;
    private double Sales ;
    private double TotalSalary;

    public BasePlusCommissionEmployee(String f_Name, String l_Name, String SSN, double totalSalary) {
        super(f_Name, l_Name, SSN);
        TotalSalary = totalSalary;
    }
    public void BaseEmpSalary(double Sales){
        TotalSalary = BasicSalary + (Sales * CommissionRate);
    }


    public double getBasicSalary() {
        return BasicSalary;
    }

    public double getSales() {
        return Sales;
    }

    public void setSales(double sales) {
        Sales = sales;
    }

    public double getTotalSalary() {
        return TotalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        TotalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return super.toString()+" BasePlusCommissionEmployee{" +
                "BasicSalary=" + BasicSalary +

                ", TotalSalary=" + TotalSalary +
                '}';
    }
}
