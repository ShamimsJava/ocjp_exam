package com.shamim.question41;

public class StackOverflowErrorExample {

    void doOne(int x) {
        doTwo(x);
    }

    void doTwo(int y) {
        doThree(y);
    }

    void doThree(int z) {
        doTwo(z);
    }

    public static void main(String[] args) {

        StackOverflowErrorExample s = new StackOverflowErrorExample();
        s.doOne(2);
        s.doTwo(2);
        s.doThree(2);
    }
}
