package com.company;

public class Flour extends Food {

    private double kilogram;

    public Flour(String kind, double kilogram) {
        super(kind);
        this.kilogram = kilogram;
    }

    public double getKilogram() {
        return kilogram;
    }

    public void setKilogram(double kilogram) {
        this.kilogram = kilogram;
    }
}
