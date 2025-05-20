package com.pluralsight.finance;

public  class Asset implements IValuable{
    String name;
    double marketValue;

    public Asset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return marketValue;
    }

}

