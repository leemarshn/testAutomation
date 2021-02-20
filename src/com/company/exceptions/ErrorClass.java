package com.company.exceptions;

/**
 * They are thrown by the JVM and
 * should not be handled or declared
 * <p>
 * ExceptionInInitializerError
 * StackOverflowError
 * NoClassDefFoundError
 */

public class ErrorClass {

    //ExceptionInInitializerError
//    static {
//        int[] countsOfMoose = new int[3];
//        int num = countsOfMoose[-1];
//    }
//
//    public static void main(String[] args) {
//    }


    //stackOverflow -> method calling itself -> infinite recursion
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }

}
