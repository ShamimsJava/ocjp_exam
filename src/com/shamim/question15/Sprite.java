package com.shamim.question15;

interface Foo {

    int bar();
}

public class Sprite {

    public int fubar(Foo foo) {

        return foo.bar();
    }

    public void testFoo() {

        fubar(new Foo() {

            @Override
            public int bar() {

                return 1;
            }
        });
    }
}
