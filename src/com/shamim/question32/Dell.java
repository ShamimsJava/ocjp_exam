package com.shamim.question32;

class Laptop {

    public static void lMethod() {

        System.out.println("This is method under Laptop.");
    }
}

class HardDisk {

    public void hMethod() {

        System.out.println("This is method under HardDisk.");
    }
}

public class Dell extends Laptop { // IS-A relationship

    public static void main(String[] args) {

        lMethod();

        HardDisk hardDisk = new HardDisk(); // HAS-A relationship

        hardDisk.hMethod();
    }

}
