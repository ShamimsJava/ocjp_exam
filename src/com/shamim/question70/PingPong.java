package com.shamim.question70;

public class PingPong implements Runnable{
    synchronized  void hit(long n){
        for (int i = 1; i < 3; i++)
            System.out.print(n + "_" + i + " ");
    }

    public static void main(String[] args) {
        new Thread(new PingPong()).start();
        new Thread(new PingPong()).start();
    }

    @Override
    public void run() {
        hit(Thread.currentThread().getId());
    }
}
