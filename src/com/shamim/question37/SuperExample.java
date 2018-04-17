package com.shamim.question37;

class Animal {

    String color = "white";

    public Animal() {

        System.out.println("Animal is created.");
    }

    public void eat() {

        System.out.println("Animal eating");
    }
}

class Dog extends Animal {

    String color = "black";

    public Dog() {

        super();
        System.out.println("Dog is create.");
    }

    public void printColor() {

        System.out.println(color);
        System.out.println(super.color);
    }

    @Override
    public void eat() {

        System.out.println("Dog eating.");
    }

    public void printEat() {

        eat();
        super.eat();
    }
}

public class SuperExample {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.printColor();
        dog.printEat();
    }
}