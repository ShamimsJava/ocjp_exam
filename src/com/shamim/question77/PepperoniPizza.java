package com.shamim.question77;

import java.util.ArrayList;

class Pizza {
    ArrayList toppings;

    public void addTopping(String topping) { // if we use final keyword then compilation error

        toppings.add(topping);
    }
}

public class PepperoniPizza extends Pizza {

    public void addTopping(String topping) {

        System.out.println("Cannot add Toppings");
    }

    public static void main(String[] args) {
        Pizza pizza = new PepperoniPizza();
        pizza.addTopping("Mushrooms");
    }
}
