import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        UnderGrad s1 = new UnderGrad("Franklin", "Information Systems", 15);
        Graduate s2 = new Graduate("Hamilton", "Computer Science", 13);
        PostGraduate s3 = new PostGraduate("Jason", "English", 12);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (Student s : students) {
            System.out.println(s.getFirstName());
            System.out.println(s.getMajor());
            System.out.println(s.getUnits() + " Units");
            System.out.println("Tuition is $" + s.calculateTuition(s.getUnits()) + "\n");
        }
    }
}
