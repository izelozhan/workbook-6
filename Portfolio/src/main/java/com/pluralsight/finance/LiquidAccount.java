package com.pluralsight.finance;

public class LiquidAccount implements IValuable {
    double balance;
    String accountNumber;
    String name;

    public LiquidAccount(String accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public LiquidAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }


    public double getValue() {
        return balance;
    }

    public String getName() {
        return this.name;
    }
}
