import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person implements AccountSystem {
    private double tuitionFee;
    private List<Course> courses;
    private Map<Course, Integer> marks;

    public Student(String studentName, double tuitionFee) {
        super(studentName, "");
        this.tuitionFee = tuitionFee;
        this.courses = new ArrayList<>();
        this.marks = new HashMap<>();
    }

    public void addMarks(Course course, int marks) {
        this.marks.put(course, marks);
    }

    public void addCourse(String name, String code, double fee) {
        Course course = new Course(code, name, new Book("", 0.0));
        courses.add(course);
    }

    @Override
    public double getFee() {
        return tuitionFee;
    }

    @Override
    public String toString(){
        return super.toString()+"Student Tution Fee: "+getFee();
    }
}
