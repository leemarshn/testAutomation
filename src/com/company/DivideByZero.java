package com.company;

public class DivideByZero {

    public static void main(String[] args) {

        divideByZero();

    }

    private static void divideByZero(){

        try {
            int c =30/0;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("you are trying to divide a number by zero");
        }finally {
            System.out.println("Division is fun");
        }
    }


}
