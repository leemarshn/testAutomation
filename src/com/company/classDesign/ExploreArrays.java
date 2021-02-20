package com.company.classDesign;

import java.util.Arrays;

public class ExploreArrays {
    /*
     * EXPLORE SOME WEIRD ARRAYS
     *
     */

    public static void main(String[] args) {
        int[] vars[]; //this is a valid initialization -> 2D array
        int[][] var2; //2D Array
        int[] vars4[], vars5 [][];// 2D array followed by a a 3D Array
        //vars5 [][];//3D array...


        //Be careful when sorting integers using Strings

//        String[] strings = { "10", "9", "100" };
//        Arrays.sort(strings);
//        for (String string : strings)
//        System.out.print(string + " ");

//        int[] numbers = { 10, 100, 1 };
//        Arrays.sort(numbers);
//        for (int i = 0; i < numbers.length; i++)
//        System.out.print (numbers[i] + " ");

        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));


    }

}
