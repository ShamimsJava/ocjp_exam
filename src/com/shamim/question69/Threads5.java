package com.shamim.question69;

public class Threads5 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("bar");
            }
        }).start();
    }
}
