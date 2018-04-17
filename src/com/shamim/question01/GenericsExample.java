package com.shamim.question01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsExample {

    public static int sum(List list) {

        int sum = 0;


        for (Iterator iter = list.iterator(); iter.hasNext(); ) {
            int i = ((Integer) iter.next()).intValue();
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1400);
        list.add(25);

        System.out.println("The sum is : " + sum(list));
    }
}
