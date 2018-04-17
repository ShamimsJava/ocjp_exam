package com.shamim.question27;

public class ItemTest {

    //private final int id;
    private int id;

    public ItemTest(int id) {

        this.id = id;
    }

    public void updateId(int newId) {

        id = newId;
    }

    public static void main(String[] args) {

        ItemTest fa = new ItemTest(42);

        fa.updateId(69);

        System.out.println(fa.id);
    }
}
