package com.shamim.question52;

public class Threads5 {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {

                System.out.println("bar");
            }
        });

        thread.start();

    }

}
