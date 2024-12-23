public class CommissionEmployee extends Employee{

    private static final double CommissionRate = 0.16;
    private double CommissionEmpSalary;
    private double Sales;
    private int count=0;

    public CommissionEmployee(String f_Name, String l_Name, String SSN) {
        super(f_Name, l_Name, SSN);
        count++;

    }

    public void CommissionSalary(double Sales){
        CommissionEmpSalary = Sales * CommissionRate;
    }





    public double getSales() {
        return Sales;
    }

    public void setSales(double sales) {
        Sales = sales;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "count=" + count +", Commission Employee Salary = "+CommissionEmpSalary +
                '}';
    }
}
