package com.shamim.question91;

public interface A111 {
    String s = "yo";
    public void method1();
}

interface B{
}

interface C extends A111, B{
    @Override
    public void method1();

    public void method1(int x);
}
