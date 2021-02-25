package com.company.basics;

import org.w3c.dom.ls.LSOutput;

import static java.lang.Boolean.TRUE;

public class Wrappers {

    Boolean b = TRUE;

    Integer iob;

     int i = iob.intValue();

    public static void main(String[] args) {
        Integer iob = 10;
        int i =  iob.intValue();
        Boolean b =  Double.valueOf(iob).isInfinite();
        System.out.println(b);
        System.out.println(i);

    }
}
