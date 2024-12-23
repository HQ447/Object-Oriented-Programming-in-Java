public class Employee {
    final private String F_Name;
    final private String L_Name;
    final private String SSN;

    public Employee(String f_Name, String l_Name, String SSN) {
        this.F_Name = f_Name;
        this.L_Name = l_Name;
        this.SSN = SSN;
    }

    public String getF_Name() {
        return F_Name;
    }



    public String getL_Name() {
        return L_Name;
    }



    public String getSSN() {
        return SSN;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "F_Name='" + F_Name + '\'' +
                ", L_Name='" + L_Name + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
