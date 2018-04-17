package com.shamim.question41;

public class StackOverflowErrorExample2 {

    void counter(int i) {

        counter(++i);
    }

    public static void main(String[] args) {

        StackOverflowErrorExample2 s = new StackOverflowErrorExample2();
        s.counter(2);
    }
}
