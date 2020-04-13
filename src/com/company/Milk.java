package com.company;

public class Milk extends IceCream {

    private double liter;

    public Milk(String kind, String chocolateIceCream, String bananaIceCream, double liter) {
        super(kind, chocolateIceCream, bananaIceCream);
        this.liter = liter;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }
}
