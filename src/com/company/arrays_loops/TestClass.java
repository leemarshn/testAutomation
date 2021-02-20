package com.company.arrays_loops;

public class TestClass {
    public static void main(String[] args) {
        int k =0;
        int v =0;
        int x =0;

//        int x = k = v =7;

        int[] arr = {10, 23};

        arr[x] = x = 30;

//        System.out.println(arr[x]);
//        System.out.println(x);




        //when the expresion is false the code cannot be reached
//        while (false){
//            x=3; //x is not reachable
//        }




        //getting an array index from a method
        arr[0] = arr[new TestClass().m1()];
        System.out.println(arr[new TestClass().m1()]);
    }

    //try to add an exception
    int m1(){
        return 1;
    }
}
