package com.company;

public class Main {

    public static void main(String[] args) {
        Flour flour = new Flour("Fast food", "Margherita", "Vegetarian", 4.7);
        Milk milk = new Milk("Dessert", "Chocolate", "Banana", 2.3);

        System.out.println("The weight of flour required for pizza is: " + flour.getKilogram());
        System.out.println("The liter of milk required for ice cream is: " + milk.getLiter());
    }
}
