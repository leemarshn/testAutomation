package com.company.arrays_loops;

public class IntArrays {
    private static Object Integer;

    public static void main(String[] args) {
//        int[][] phoneNUmbers;
//        phoneNUmbers = new int[2][];
////        phoneNUmbers[1][0] = 7885;
//        phoneNUmbers[0][0]= 90898;
//        phoneNUmbers[0][1]= 7899;
//
//        for (int [] num: phoneNUmbers)
//            for (int phones: num)
//            System.out.println(phones);

        String multiStrArr[][] = new String[][]{
                {"A", "B"},
                {"p"},
                {"Jan", "Feb", "Mar"},
        };

        outer: for (String[] str: multiStrArr)
            inn: for (String st: str) {
                if (st.equals("B"))
                    continue inn;
                System.out.println(st);
            }



    }
}
