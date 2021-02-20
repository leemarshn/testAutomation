package com.company.stringBuffer;

/**
 * STRINGBUFFER CONSTRUCTORS
 * StringBuffer()
 * StringBuffer(int i)
 * StringBuffer(String i)
 * StringBuffer(CharSequence chars)
 * ************************************************
 * StringBuilder is similar to StringBuffer but Builder
 * is not thread safe, but it is faster than buffer
 */

public class StringBuffer1 {

    public static void main(String[] args) {
        StringBuilder sb = new  StringBuilder("Hello");
//        sb.setCharAt(1,'i'); //counts from 0
//        sb.ensureCapacity(5);
//        sb.setLength(2);
//        System.out.println(sb.capacity());
        sb.append(" World");
//        sb.append(5);
        sb.insert(sb.length(),"-Interrupted-");
//        sb.reverse();
//        sb.delete(0,0); //starts at index to -1
//        sb.deleteCharAt(5); //starts at index to -1
//       sb.replace(0,5, "Howdy!"); //counts from 0 to -1
       sb.substring(5);

        System.out.println("Substring 0,5------ "+sb.substring(0,5)); //counts from 0 to -1 // returns a potion of the string
        System.out.println("Capacity ==== "+sb.capacity());
        System.out.println("Length ===== "+sb.length());
        System.out.println("String Builder ----- " + sb);
    }
}
