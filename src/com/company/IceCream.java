package com.company;

public class IceCream extends Milk{

    private String chocolateIceCream;
    private String bananaIceCream;

    public IceCream(String kind, double liter, String chocolateIceCream, String bananaIceCream) {
        super(kind, liter);
        this.chocolateIceCream = chocolateIceCream;
        this.bananaIceCream = bananaIceCream;
    }

    public String getChocolateIceCream() {
        return chocolateIceCream;
    }

    public void setChocolateIceCream(String chocolateIceCream) {
        this.chocolateIceCream = chocolateIceCream;
    }

    public String getBananaIceCream() {
        return bananaIceCream;
    }

    public void setBananaIceCream(String bananaIceCream) {
        this.bananaIceCream = bananaIceCream;
    }
}
