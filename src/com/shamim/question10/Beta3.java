package com.shamim.question10;

interface Foo3 {

    int bar();
}

public class Beta3 {

    class A implements Foo3 {

        @Override
        public int bar() {

            return 1;
        }

    }

    public int fubar(Foo3 foo3) {

        return foo3.bar();
    }

    public void testFoo3() {

        System.out.println(fubar(new A()));
    }

    public static void main(String[] args) {

        new Beta3().testFoo3();

    }

}
