import java.util.TreeSet;
public class TestSort {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<Student>();
        students.add(new Student("Evan", 20));
        students.add(new Student("Eugene", 21));
        students.add(new Student("Adam", 19));

        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
