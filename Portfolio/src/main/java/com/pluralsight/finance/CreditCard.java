package com.pluralsight.finance;

public class CreditCard extends LiquidAccount {

    public CreditCard(String name, String accountNumber, double balance) {
        super(accountNumber, balance, name);
    }

    public void charge(double amount) {
        super.balance -= amount;
    }

    public void pay(double amount) {
        super.balance += amount;
    }
}

