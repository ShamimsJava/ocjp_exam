package com.shamim.question14;

public class StaticArray {

    static final int[] a = {100, 200};

    static final int[] b;

    static {

        b = new int[2];
        b[0] = 100;
        b[1] = 200;
    }

    //static final int[] c = new int[2] {100, 200}
	
	/*
	static final int[] d;
	
	static void init() {
		d = new int[3];
		d[0] = 100;
		a[1] = 200;
	}
	*/
}
