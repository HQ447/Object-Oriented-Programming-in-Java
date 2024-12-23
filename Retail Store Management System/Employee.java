// Employee class
class Employee {
    private String empID;
    private String name;
    private String address;
    private String contactNumber;
    private String emailAddress;
    private String jobTitle;
    private double hours;
    private double fixedPay=50000;
    private double hourlyPay=500;
    private double totalPay=0;

    public Employee(String empID, String name, String address, String contactNumber, String emailAddress, String jobTitle,double h) {
        this.empID = empID;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.jobTitle = jobTitle;
        this.hours=h;
        
    }



    public double staffPay(){

    if (jobTitle=="cashier"|| jobTitle=="Cashier"){
        if(hours<=40){
         totalPay=hourlyPay*hours;
        }else{
        totalPay= ((hours-40)*1.5)+(hourlyPay*hours);
        }
    }
    else{
        totalPay=fixedPay;
    }

    return totalPay;
}


@Override
public String toString() {
    // return String.format("Employee ID:%s%nEmployee Name:%s%nEmployee Address:%s%nEmployee Contact:%s%nEmployee Email:%s%nJob Title:%s%nThe pay of%s is %f",empID,name,address,contactNumber,emailAddress,jobTitle,staffPay());

    return String.format("\nCashier or Store Employee Details%nName:%s%nJob Title:%s%nSalary:%f%n",name,jobTitle,staffPay());
}

}
