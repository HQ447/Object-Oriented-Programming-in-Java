import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee("Abdul","Basit","745");

        CommissionEmployee commissionEmployee = new CommissionEmployee("Abdul","Basit","745");
        commissionEmployee.CommissionSalary(60000);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Abdul","Basit","745",45);
        basePlusCommissionEmployee.BaseEmpSalary(60000);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Abdul","Basit","745",40000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Abdul","Basit","745", 50, 15.00);
        hourlyEmployee.earnings();

        PieceWorkers pieceWorkers = new PieceWorkers("Abdul","Basit","745",3,5600,2);




        System.out.println(employee.toString());
        System.out.println(commissionEmployee.toString());
        System.out.println(basePlusCommissionEmployee.toString());
        System.out.println(salariedEmployee.toString());
        System.out.println(hourlyEmployee.toString());
     System.out.println(pieceWorkers.toString());


//        System.out.println("Enter The Total Sales of Commission Employee");
//        commissionEmployee.CommissionSalary(scanner.nextDouble());
//        System.out.println(commissionEmployee.toString());
//        System.out.println("Enter The Total Sales of BasePlusCommission Employee");
//        basePlusCommissionEmployee.BaseEmpSalary(scanner.nextDouble());
//        System.out.println(basePlusCommissionEmployee.toString());




    }
}