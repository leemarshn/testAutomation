package com.company.arrays_loops;

public class JavaArrayGuru2 {
    public static void main(String[] args) {

        int[] arr1;
        int[] arr2 = new int[3];
        char[] arr3 = {'a', 'b'};
        arr1 = arr2;
//        arr1 = arr3;
        System.out.println(arr1[0] + ":" + arr1[1]);
    }
}
