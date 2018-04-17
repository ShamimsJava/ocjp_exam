package com.shamim.question74;

class ClassA {
    public int numberOfInstnces;

    protected ClassA(int numberOfInstnces) {
        this.numberOfInstnces = numberOfInstnces;
    }
}

public class ExtendedA extends ClassA {
    private ExtendedA(int numberOfInstnces) {
        super(numberOfInstnces);
    }

    public static void main(String[] args) {
        ExtendedA ext = new ExtendedA(420);
        System.out.println(ext.numberOfInstnces);
    }
}
