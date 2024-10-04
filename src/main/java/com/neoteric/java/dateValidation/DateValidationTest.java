package com.neoteric.java.dateValidation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateValidationTest {

    public static void main(String[] args) {
        Date date=new Date();

        SimpleDateFormat sd=new SimpleDateFormat();
        sd.setTimeZone(TimeZone.getTimeZone("UTC"));

        String date1=sd.format(date);
        System.out.println(date1);
        System.out.println(date);
    }

}
