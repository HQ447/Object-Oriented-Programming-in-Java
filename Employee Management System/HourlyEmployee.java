public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;

    public HourlyEmployee(String f_Name, String l_Name, String SSN, double hours, double wage) {
        super(f_Name, l_Name, SSN);
        this.hours = hours;
        this.wage = wage;
    }




    // Setters and getters for HourlyEmployee-specific attributes
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0 && hours <= 168) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Hours must be between 0 and 168");
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 0) {
            this.wage = wage;
        } else {
            throw new IllegalArgumentException("Wage must be nonnegative");
        }
    }

    // Earnings method
    public double earnings() {
        if (hours <= 40) {
            return hours * wage;
        } else {
            return 40 * wage + (hours - 40) * 1.5 * wage;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"PieceWorkers{" +
                "hours=" + getHours() +
                ", wage=" + getWage() +"Total Salary of Hourly Employee = "+earnings()+" "+hours+" hours worked"+" Wage "+wage+
                '}';
    }
}
