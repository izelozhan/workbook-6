package com.pluralsight.finance;

public class CreditCard extends LiquidAccount {

    public CreditCard(String name, double balance) {
        super(name, balance);
    }

    public void charge(double amount) {
        super.balance -= amount;
    }

    public void pay(double amount) {
        super.balance += amount;
    }
}

