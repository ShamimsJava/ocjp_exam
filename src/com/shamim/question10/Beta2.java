package com.shamim.question10;

interface Foo2 {

    int bar();
}

public class Beta2 {

    public int fubar(Foo2 foo2) {

        return foo2.bar();
    }

    public void testFoo2() {

        class A implements Foo2 {

            @Override
            public int bar() {

                return 2;
            }

        }

        System.out.println(fubar(new A()));
    }

    public static void main(String[] args) {

        new Beta2().testFoo2();

    }

}
