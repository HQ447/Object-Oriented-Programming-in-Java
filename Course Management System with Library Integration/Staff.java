import java.util.ArrayList;
import java.util.List;

public class Staff extends Person implements AccountSystem {
    private double salary;
    private List<Course> courses;

    public Staff(String staffName, double salary) {
        super(staffName, "");
        this.salary = salary;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseCode, String courseName) {
        if (courses.size() < 3) {
            Course course = new Course(courseCode, courseName, null);
            courses.add(course);
        } else {
            System.out.println("Staff can only be enrolled in a maximum of 3 courses.");
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public double getFee() {
        return salary;
    }

    @Override
    public String toString(){
        return super.toString()+"Staff Salary: "+getFee();
    }
}
