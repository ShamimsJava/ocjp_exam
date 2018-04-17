package com.shamim.question12;

class Alpha {

    public void foo() {
        System.out.print("Afoo ");
    }
}

public class Beta extends Alpha {

    @Override
    public void foo() {
        System.out.print("Bfoo ");
    }

    public static void main(String[] args) {

        Alpha a = new Beta();

        Beta b = (Beta) a;

        a.foo();
        b.foo();
    }
}
