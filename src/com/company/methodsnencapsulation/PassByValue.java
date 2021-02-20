package com.company.methodsnencapsulation;

public class PassByValue {

    public static void main(String[] args) {
        int a = 100;
        addVat(a);

        System.out.println(a);

    }

    static double addVat(int a){
        return a * 1.16;
    }
}
