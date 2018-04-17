package com.shamim.question55;

public class TestFive2 {

    private int x;

    public void foo() {

        int current = x;

        x = current + 1;

        System.out.print(x + ", ");
    }

    public void go() {

        for (int i = 0; i < 5; i++) {

            new Thread() {

                public void run() {

                    foo();

                }

            }.start();
        }
    }

    public static void main(String[] args) {

        TestFive2 testFive = new TestFive2();
        testFive.go();
    }
}
