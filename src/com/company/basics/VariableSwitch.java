package com.company.basics;

public class VariableSwitch {

      public static void main(String args [ ]) {

                                final int x = 4;
                                final int y = 2;

                                switch(x) {
                                                case x   : {System.out.print("A");}
                                                case 1    : System.out.print("B");
                                                default : System.out.print("default"); break;
                                                case y    : System.out.print("C");
                                }
                }
}
