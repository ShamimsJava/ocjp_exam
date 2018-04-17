package com.shamim.question35;

class Laptop {

    public String name = "Laptop";

    public void getName() {

        System.out.println("Name is " + name);
    }
}

class Dell extends Laptop {

    public String name = "Dell";

    @Override
    public void getName() {

        System.out.println("Name is " + name);
    }


}

public class Bar2 {

    public static void main(String[] args) {

        Laptop laptop = new Dell();

        System.out.println(laptop.name);

        laptop.getName();
    }

}
