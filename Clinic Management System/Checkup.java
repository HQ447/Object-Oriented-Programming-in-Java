import java.util.Date;
class Checkup {
    private int checkupID;
    private Date dateOfCheckup;
    private Date followUpDate;
    private String disease;
    private Doctor doctor;
    private Patient patient;

    public Checkup(int checkupID, Date dateOfCheckup, Date followUpDate, String disease, Doctor doctor, Patient patient) {
        this.checkupID = checkupID;
        this.dateOfCheckup = dateOfCheckup;
        this.followUpDate = followUpDate;
        this.disease = disease;
        this.doctor = doctor;
        this.patient = patient;
    }

    // Getters
    public int getCheckupID() {
        return checkupID;
    }

    public Date getDateOfCheckup() {
        return dateOfCheckup;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    // Setters
    public void setCheckupID(int checkupID) {
        this.checkupID = checkupID;
    }

    public void setDateOfCheckup(Date dateOfCheckup) {
        this.dateOfCheckup = dateOfCheckup;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return String.format("Checkup ID: %d\nDate of Checkup: %s\nFollow-up Date: %s\nDisease: %s\nDoctor: %s\nPatient: %s",
                checkupID, dateOfCheckup.toString(), followUpDate.toString(), disease, doctor.getName(), patient.getName());
    }
}