package com.shamim.question42;

import java.io.IOException;

class A {

    public void process() throws IOException {

        System.out.print("A,");
    }

}

public class B extends A {

    public void process() throws IOException {

        super.process();

        System.out.print("B,");

        throw new IOException();
    }

    public static void main(String[] args) {

        try {

            new B().process();

        } catch (IOException e) {

            System.out.println("Exception");
            //e.printStackTrace();
        }
    }
}