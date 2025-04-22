package ConstructorOverloadingDemo;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.showEmployeeNumber();

        Employee e1 = new Employee(2025002);
        e1.showEmployeeNumber();
    }
}
