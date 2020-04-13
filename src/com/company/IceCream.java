package com.company;

public class IceCream extends Food{

    private String chocolateIceCream;
    private String bananaIceCream;

    public IceCream(String kind, String chocolateIceCream, String bananaIceCream) {
        super(kind);
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
