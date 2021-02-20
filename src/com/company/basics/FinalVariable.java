package com.company.basics;

/**
 * final instance variables must be initilized
 * local variable can be initialized seperatly from declarations
 * final variables cannot be modified
 */
public class FinalVariable {
   static final int jj =67;

    public static void main(String[] args) {
        int y = 10;
         final int x;
        if (y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
    }
}
