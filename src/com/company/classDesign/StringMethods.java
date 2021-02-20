package com.company.classDesign;

public class StringMethods {

    public static void main(String[] args) {


        //index of

        String string = "animals";
        System.out.println(string.indexOf('a'));
//        System.out.println(string.indexOf("al"));
//        System.out.println(string.indexOf('a', 4));
//        System.out.println(string.indexOf("mals", 3));

        //charAt

        String stringOfCharAt = "animals";
        System.out.println(stringOfCharAt.charAt(0));
//        System.out.println(stringOfCharAt.charAt(6));
//        System.out.println(stringOfCharAt.charAt(7));

            //substring
            //int substring(int beginIndex)
            //int substring(int beginIndex, int endIndex)

        String stringOfSubstring ="Animals";
        System.out.println(stringOfSubstring.substring(3));
//        System.out.println(stringOfSubstring.substring(8));
//        System.out.println(stringOfSubstring.substring(2,17));

    }
}
