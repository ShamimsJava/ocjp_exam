package com.test.question29;

public class GC {
    private Object obj;

    private void doSomethingElse(Object obj){
        this.obj = obj;
    }

    public void doSomething(){
        Object o = new Object();
        doSomethingElse(o);
        o = new Object();
        doSomethingElse(null);
        o = null;
    }
}
