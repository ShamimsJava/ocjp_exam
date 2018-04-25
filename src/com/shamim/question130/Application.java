package com.shamim.question130;

public class Application {
    public static void main(String[] args) {
        System.out.println("It is possible for more than two threads to deadlock at once.");
        System.out.println("If a piece of code is capable of deadlocking, you cannot eliminate the possibility of deadlocking\n" +
                "by inserting invocations of Thread.yield().");
    }
}
