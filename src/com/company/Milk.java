package com.company;

public class Milk extends Food {

    private double liter;

    public Milk(String kind, double liter) {
        super(kind);
        this.liter = liter;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }
}
