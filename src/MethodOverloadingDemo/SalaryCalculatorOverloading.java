package MethodOverloadingDemo;

public class SalaryCalculatorOverloading {
    public static void main(String[] args) {
        System.out.println(getSalary(100.00, 186.90, 10));
        System.out.println(getSalary(100.00, 186.90, .10));
    }

    public static double getSalary(double hrsWorked, double ratePerHour, int tax){
        double grossPay = hrsWorked * ratePerHour;
        double taxDeduction = grossPay * tax/100;

        return grossPay - taxDeduction;
    }
    public static double getSalary(double hrsWorked, double ratePerHour, double tax){
        double grossPay = hrsWorked * ratePerHour;
        double taxDeduction = grossPay * tax;
        return grossPay -taxDeduction;
    }

}
