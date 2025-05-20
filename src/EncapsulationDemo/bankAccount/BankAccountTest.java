package EncapsulationDemo.bankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println(account1.getBalance());

        account1.deposit(150.00);
        System.out.println(account1.getBalance());

        account1.withdraw(200.00);
        System.out.println(account1.getBalance());
    }
}
