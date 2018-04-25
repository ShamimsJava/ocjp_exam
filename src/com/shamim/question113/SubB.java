package com.shamim.question113;

class X{
    public void foo(){
        System.out.println("X ");
    }
}

public class SubB extends X{
    public void foo() throws RuntimeException{
        super.foo();
        if(true)
            throw new RuntimeException();
        System.out.println("B ");
    }

    public static void main(String[] args) {
        new SubB().foo();
    }
}
