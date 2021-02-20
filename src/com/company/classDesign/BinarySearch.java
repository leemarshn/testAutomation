package com.company.classDesign;

import java.util.Arrays;

public class BinarySearch {



    public static void main(String[] args) {
        String message          = "I Love saying good morning to Love a girl I love";
        String [] arrMessage =message.split("\\s");
        Arrays.sort(arrMessage);
        for (String s: arrMessage) System.out.println(s);
       int index = Arrays.binarySearch(arrMessage, "Love");
        System.out.println(index);

        String name = "lee";

    }


}
