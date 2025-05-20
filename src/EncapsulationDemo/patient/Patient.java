package EncapsulationDemo.patient;

public class Patient {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null || !name.isEmpty()){
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
    }
}
