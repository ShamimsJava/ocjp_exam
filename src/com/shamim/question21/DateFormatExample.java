package com.shamim.question21;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample {

    public static void main(String[] args) {

        DateFormat df;

        Date date = new Date();

        df = DateFormat.getInstance();

        String s = df.format(date);

        System.out.println(s);
    }
}
