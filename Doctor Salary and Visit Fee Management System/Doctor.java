public class Doctor extends SalariedEmpolyee {
    private String doctorSpeciality;
    private String doctorTitle;
    private double visitFee;

    public Doctor(String empID,String firstName,String lastName,double salary, String doctorSpeciality, String doctorTitle,double visitFee) {
      super(empID, firstName, lastName, salary);
        this.doctorSpeciality = doctorSpeciality;
        this.doctorTitle = doctorTitle;
        this.visitFee=visitFee;
    }

    @Override
    public double earing(){
        return getSalary()+visitFee;
    }

    @Override
    public String toString(){
        return super.toString()+"\nDoctor Speciality: "+doctorSpeciality+"\nDoctor Title: "+doctorTitle+"\nDoctor Visit Fee: "+visitFee+"\nSalary + Visit Fee: "+earing();
    }
}
