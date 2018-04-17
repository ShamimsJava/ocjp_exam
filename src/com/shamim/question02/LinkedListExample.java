package com.shamim.question02;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Shamim1");
        linkedList.add("Shamim2");
        linkedList.add("Shamim3");
        linkedList.add("Shamim4");

        Iterator<String> itr = linkedList.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }

    }

}
