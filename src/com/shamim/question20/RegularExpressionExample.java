package com.shamim.question20;

public class RegularExpressionExample {

    public static void main(String[] args) {

        String test = "Test A. Test B. Test C.";

        String regex = "\\.\\s*";

        String[] result = test.split(regex);

        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);
        }
    }

}
