package EncapsulationDemo.sis;

public class Student {
    private int id;
    private String name;
    private String subject;


    public Student( String name) {
        this.name = name;
    }

    public String enroll(String subject, String role){
        if (role.equals("Student")){
            this.subject = subject;
        }
        return "Not Allowed to enrol";
    }
    public String drop(int id, String role) {
        if (role.equals("Teacher")) {
            this.id = id;
        }
        return "Not allowed to drop";
    }
}
