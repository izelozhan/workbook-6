package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "checking", 0);
        account1.deposit(100);
        System.out.println(account1.getValue());
        account1.withdraw(50);
        System.out.println(account1.getValue());
    }
}
