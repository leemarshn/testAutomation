package com.company.basics;

public class StaticVariable {
     final static int j = 32;

    public static void main(String args[]) {
        char c = 'A'; //ASCII value of 'A' is 65 and 'a' is 97
        System.out.print((char) calc(c));
    }

    static int calc(int i) {
        return (i + j);
    }
}