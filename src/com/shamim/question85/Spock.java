package com.shamim.question85;

public class Spock {
    public static void main(String[] args) {
        Long tail = 2000L;
        Long distance = 1999L;
        Long story = 1000L;

        if ((tail > distance) ^ ((story * 2) == tail)) // 1^1 = 0
            System.out.println("1");

        if ((distance + 1 != tail) ^ ((story * 2) == distance)) // 0 ^ 0 = 0
            System.out.println("2");
    }
}


/*
 * ^ (bitwise XOR)
 * a = 0011 1100
 * b = 0000 1101
 * a^b = 0011 0001
 * */