package ConstructorOverloadingDemo;

public class TestStudent {
    public static void main(String[] args) {
        StudentNum s1  = new StudentNum();
        StudentNum s2 = new StudentNum("Irregular");

        s1.showStat();
        s2.showStat();
    }
}
