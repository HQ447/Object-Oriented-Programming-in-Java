public class TestStudent {
    public static void main(String[] args) {
        Student s1 =  new Student();
        System.out.println(s1);

        Student s2 = new Student("CSF120212060", "Fazal", 80);
        System.out.println(s2);

        undergraduate u1 = new undergraduate("1401", "Ali", 50, 63);
        System.out.println(u1);

        Postgraduate p1 = new Postgraduate("5021", "Ghani", 90, 3);
        System.out.println(p1);

        System.out.println("number of student "+ Student.getNoOfStudent());

    }
}
