package com.shamim.question55;

public class TestFive3 {

    private int x;

    public void foo() {

        synchronized (this) {

            int current = x;

            x = current + 1;

            System.out.print(x + ", ");
        }
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

        TestFive3 testFive = new TestFive3();
        testFive.go();
    }
}
