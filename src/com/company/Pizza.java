package com.company;

public class Pizza extends Food{

    private String margheritaPizza;
    private String vegetarianPizza;

    public Pizza(String kind, String margheritaPizza, String vegetarianPizza) {
        super(kind);
        this.margheritaPizza = margheritaPizza;
        this.vegetarianPizza = vegetarianPizza;
    }

    public String getMargheritaPizza() {
        return margheritaPizza;
    }

    public void setMargheritaPizza(String margheritaPizza) {
        this.margheritaPizza = margheritaPizza;
    }

    public String getVegetarianPizza() {
        return vegetarianPizza;
    }

    public void setVegetarianPizza(String vegetarianPizza) {
        this.vegetarianPizza = vegetarianPizza;
    }
}
