package ConstructorOverloadingDemo;

public class StudentNum {
    String stat;

    public StudentNum(String status){
        stat = status;
    }
    public StudentNum(){
        stat = "Regular";
    }

    public void showStat(){
        System.out.println(stat);
    }
}
