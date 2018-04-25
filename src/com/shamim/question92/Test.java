package com.shamim.question92;

interface TestA{
    String toString();
}

public class Test {
    public static void main(String[] args) {
        System.out.println(new TestA() {
            @Override
            public String toString() {
                return "test";
            }
        });
    }
}
