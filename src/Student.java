import ConstructorOverloadingDemo.StudentNum;

public class Student {
    private int stuNum = 001;
    private double gpa = 3.0;

    public Student(){
        this(003, 2.0);
    }
    public Student(int num){
        this(num, 0.0);
    }
    public Student(int stuNum, double gpa){
        this.stuNum = stuNum;
        this.gpa = gpa;
    }

    public void showStudent(){
        System.out.println("Student Number " + stuNum + " GPA: " + gpa);
    }
}
