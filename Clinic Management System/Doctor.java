class Doctor {
    private int idNo;
    private String name;
    private String specialization;
    private String contactNo;
    private String emailAddress;

    public Doctor(int idNo, String name, String specialization, String contactNo, String emailAddress) {
        this.idNo = idNo;
        this.name = name;
        this.specialization = specialization;
        this.contactNo = contactNo;
        this.emailAddress = emailAddress;
    }

    // Getters and setters
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

