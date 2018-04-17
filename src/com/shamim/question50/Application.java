package com.shamim.question50;

public class Application {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (i > 6)
                break;

            System.out.println(i);
        }

        //System.out.println(i); // compilation fails

    }

}
