public class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
     public int compareTo(Student s){
        return Integer.compare(this.age,s.age);
     }
}
