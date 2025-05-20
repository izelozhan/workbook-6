package com.pluralsight.finance;

public class House extends Asset{

    int yearBuilt;
    int squareFeet;
    int bedrooms;

    public House( int yearBuilt, int squareFeet, int bedrooms, String name, double marketValue) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }
}
