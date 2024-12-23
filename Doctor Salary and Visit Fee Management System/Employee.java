public class Employee{
    private String empID;
    private String firstName;
    private String lastName;

    public Employee(String empID , String firstName,String lastName){
        this.empID=empID;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    
    public String toString(){
        return String.format("Employee ID is: %s%nEmployee Name: %s%n",empID,firstName,lastName);
    }
}