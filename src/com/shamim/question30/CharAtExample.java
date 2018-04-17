package com.shamim.question30;

public class CharAtExample {

    public static void test(String str) {

        int check = 4;

        if (check == str.length()) { // if we use single = then compilation fails

            System.out.print(str.charAt(check -= 1) + ",");
        } else {

            System.out.print(str.charAt(0) + ",");
        }
    }

    public static void main(String[] args) {

        test("four");
        test("tee");
        test("to");
    }
}
