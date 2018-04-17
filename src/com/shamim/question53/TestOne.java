package com.shamim.question53;

public class TestOne implements Runnable {

    public static void main(String[] args) throws Exception {

        Thread thread = new Thread(new TestOne());
        thread.start();
        System.out.print("Started");
        thread.join();
        System.out.print("Complete");
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {
            System.out.print(i);
        }
    }

}
