package com.company.lamdas;

public class LambdaReverseString {
    public static void main(String[] args) {

        MyInt<String> str;

        str = text -> {
            String results ="";
            for (int i =text.length()-1; i>=0; i--)
                results += text.charAt(i);
            return results;


        };

        System.out.println(str.getFactorial("Lambda is good"));

    }
}
