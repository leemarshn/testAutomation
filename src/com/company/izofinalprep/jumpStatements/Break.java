package com.company.izofinalprep.jumpStatements;


// Using break as a civilized form of goto.
class Break {
    public static void main(String args[]) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if(t) break second; // break out of second block
                    System.out.println("This is the third block");
                }
                System.out.println("This is the second block");
            }
            System.out.println("This is the first block");
        }
    }
}