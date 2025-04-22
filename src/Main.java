
public class Main {
    public static void main(String[] args) {

        Student student = new Student(2020001, 1.75);
        student.showStudent();

        Student s2 = new Student();
        s2.showStudent();

        Student s3 = new Student(003);
        s3.showStudent();
    }
}
