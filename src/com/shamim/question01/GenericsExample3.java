package com.shamim.question01;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample3 {

    public static int sum(List<Integer> intList) {

        int sum = 0;


        for (int i : intList) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1400);
        list.add(25);

        System.out.println("The sum is : " + sum(list));
    }
}
