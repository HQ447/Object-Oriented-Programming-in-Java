import java.util.Date;

class Patient {
    private int patientID;
    private String name;
    private String disease;
    private String contactNo;
    private Date appointmentDate;

    public Patient(int patientID, String name, String disease, String contactNo, Date appointmentDate) {
        this.patientID = patientID;
        this.name = name;
        this.disease = disease;
        this.contactNo = contactNo;
        this.appointmentDate = appointmentDate;
    }

    // Getters and setters
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}