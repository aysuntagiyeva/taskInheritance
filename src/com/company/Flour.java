package com.company;

public class Flour extends Pizza {

    private double kilogram;

    public Flour(String kind, String margheritaPizza, String vegetarianPizza, double kilogram) {
        super(kind, margheritaPizza, vegetarianPizza);
        this.kilogram = kilogram;
    }

    public double getKilogram() {
        return kilogram;
    }

    public void setKilogram(double kilogram) {
        this.kilogram = kilogram;
    }
}
