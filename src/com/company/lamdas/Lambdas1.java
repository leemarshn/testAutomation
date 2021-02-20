package com.company.lamdas;

public class Lambdas1 {
    public static void main(String[] args) {

        MyNumber number;

        number =   (n) ->(n%2)==0;
        System.out.println(number.getValue(8));
    }
}
