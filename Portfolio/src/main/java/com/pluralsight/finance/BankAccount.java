package com.pluralsight.finance;

public class BankAccount extends LiquidAccount {

    public BankAccount(String name, String accountNumber, double balance) {
        super(accountNumber, balance, name);
    }

    public void withdraw(double amount){
        if (super.balance - amount < 0){
            System.out.println("You don't have that much money");
        } else {
            super.balance -= amount;
        }
    }

    public void deposit(double amount){
        super.balance += amount;
    }
}
