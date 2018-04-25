package com.shamim.question103;

public class Donkey {

    public static void main(String[] args) {
        boolean assertsOn = false;
        assert (assertsOn) : assertsOn = true;
        if (assertsOn) {
            System.out.println("assert in on");
        }
    }
}
