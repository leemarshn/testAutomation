package com.company.classDesign;

import java.util.Arrays;

public class ArrayFromStringReverse {
    public static void main(String[] args) {

        String text = "{ ( [ ] ) } I Love Having quiet Time With God in The Morning";
        String[] textArray = text.split("\\s");

        for (int i = textArray.length-1; i>0; i--)
//            System.out.println(textArray[i]);
        Arrays.sort(textArray);
        for (String s: textArray)
            System.out.println(s);

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
//        System.out.println(sb);

    }
}
