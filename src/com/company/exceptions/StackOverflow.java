package com.company.exceptions;

public class StackOverflow {
    public static void main(String[] args) {
        myMethod();
    }
    public static final void myMethod(){
        System.out.println("myMethod()");
        myMethod();
    }
}
