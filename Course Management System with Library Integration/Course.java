public class Course implements AccountSystem {
    private String courseCode;
    private String courseName;
    private Book associatedBook;
    private double registrationFee = 3000.0;

    public Course(String courseCode, String courseName, Book associatedBook) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.associatedBook = associatedBook;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    @Override
    public double getFee() {
        return registrationFee;
    }

    public String toString(){
        return String.format("Course Name: %s%nCourse Code: %s%nRegestration Fee: ",courseName,courseCode,registrationFee);
    }
}
