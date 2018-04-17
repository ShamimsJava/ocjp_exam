package com.shamim.question12;

class Alpha2 {

    public void foo() {
        System.out.print("Afoo ");
    }
}

public class Beta2 extends Alpha2 {

    @Override
    public void foo() {
        System.out.print("Bfoo ");
    }

    public static void main(String[] args) {

        Alpha2 a = new Alpha2();

        Beta2 b = new Beta2();

        a.foo();
        b.foo();
    }
}
