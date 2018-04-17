package com.shamim.question83;

interface DeclareStuff{
    public static final int EASY = 3;
    void doStuff(int t);
}

public class TestDeclare implements DeclareStuff{

    @Override
    public void doStuff(int s) {
        //s += EASY + ++s;
        s = s + EASY + s + 1;
        System.out.println("s " + s);
    }

    public static void main(String[] args) {
        int x = 5;
        new TestDeclare().doStuff(++x);

        //System.out.println(EASY);
    }
}
