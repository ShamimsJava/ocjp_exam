package com.shamim.question29;

public class GC {

    private Object o;

    private void doSomethingElse(Object obj) {

        o = obj;
    }

    public void doSomething() {

        Object o = new Object();

        doSomethingElse(o);

        o = new Object();

        doSomethingElse(null);

        o = null;
    }
}
