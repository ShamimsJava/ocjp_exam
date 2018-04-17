package com.shamim.question36;

class Animal {

    public String noise() {

        return "peep";
    }
}

class Dog extends Animal {

    @Override
    public String noise() {

        return "bark";
    }
}

class Cat extends Animal {

    @Override
    public String noise() {

        return "meow";
    }
}

public class App {

    public static void main(String[] args) {

        Animal animal = new Dog();
        //Cat cat = (Cat)animal;
        Dog dog = (Dog) animal;

        System.out.println(dog.noise());
    }
}
