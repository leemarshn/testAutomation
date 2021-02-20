package com.company.methodsnencapsulation;

public class Static {
    private  String name = "Static class";

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }

    public static void main(String args[]) {
        Static stat = new Static();
        first();
        second();
        stat.third();
// DOES NOT COMPILE
    }

}
