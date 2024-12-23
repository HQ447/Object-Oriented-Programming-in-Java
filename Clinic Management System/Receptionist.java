import java.util.Date;

class Receptionist {
    private int idNo;
    private String name;
    private Date birthdate;
    private Date hiredate;
    
    // Constructor
    public Receptionist(int idNo, String name, Date birthdate, Date hiredate) {
        this.idNo = idNo;
        this.name = name;
        this.birthdate = birthdate;
        this.hiredate = hiredate;
    }
    
    // Getters and Setters
    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}