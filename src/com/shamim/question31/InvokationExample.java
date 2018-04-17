package com.shamim.question31;

interface A {

    public void aMethod();
}

interface B {

    public void bMethod();
}

interface C extends A, B {

    public void cMethod();
}

class D implements B {

    @Override
    public void bMethod() {

        System.out.println("bMethod() is called under D class.");
    }
}

class E extends D implements C {

    public void aMethod() {

        System.out.println("aMethod() is called under E class.");
    }

    public void bMethod() {

        System.out.println("bMethod() is called under E class..");
    }

    @Override
    public void cMethod() {

        System.out.println("cMethod() is called under E class..");
    }

}

public class InvokationExample {

    public static void main(String[] args) {

        D e = (D) new E();
        e.bMethod();

    }

}
