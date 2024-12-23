public class SalariedEmpolyee extends Employee {
    private double salary;

    public SalariedEmpolyee(String empID,String firstName,String lastName,double salary) {
        super(empID, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
   
    public double earing(){
        return salary;
    }

    @Override
    public String toString(){
        return super.toString()+"Employee Salary is "+earing();
    }

    
}
