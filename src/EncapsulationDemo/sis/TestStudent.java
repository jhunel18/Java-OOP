package EncapsulationDemo.sis;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Mark");

        student.enroll("OOP", "student");
        student.drop(2, "teacher");
    }
}
