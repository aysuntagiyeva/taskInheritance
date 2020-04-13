package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("Fast food", 4.7, "Margherita", "Vegetarian");
        IceCream iceCream = new IceCream("Dessert", 2.3, "Chocolate", "Banana");

        System.out.println("The name of pizza is: " + pizza.getMargheritaPizza());
        System.out.println("The name of icecream is: " + iceCream.getBananaIceCream());
    }
}
