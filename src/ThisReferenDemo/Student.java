package ThisReferenDemo;

public class Student {
    private int stuNum;
    private double gpa;

    public Student(int stuNum, double gpa){
        this.stuNum = stuNum;
        this.gpa = gpa;
    }
    public Student(double avg){
        this(999, avg);
    }
    public Student(int num){
       this(num, 0.0);
    }
    public Student(){
        this(999, 0.0);
    }

    public void showStudent(){
        System.out.println("ThisReferenDemo.Student " + stuNum + "gpa" + gpa);
    }
}
