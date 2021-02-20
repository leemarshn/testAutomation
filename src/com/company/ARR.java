package com.company;

public class ARR {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        change(arr[2]);
        change(arr);
        System.out.println(arr[1]+arr[2]);
//        System.out.println(arr);
    }

    public static void change(int x){
        x =1;
    }

    public static void change(int[] x){
        x[1]=0;
    }
}
