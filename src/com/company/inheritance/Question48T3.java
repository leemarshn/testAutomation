package com.company.inheritance;

public class Question48T3 {
    Question48T3(){    System.out.print("MainClass ");                                }
}
class SubClass extends Question48T3{
                {System.out.print("I ");}
                static{System.out.print("S ");}
                SubClass(int i){
                                this();
                                System.out.print("SubClass ");
                }

                SubClass(){
                                super();
                                System.out.print("SubClass ");
                }
 }
 class SubSubClass extends SubClass{
                SubSubClass(String s){
                                super();
                                System.out.print("SubSubClass ");
                }
                public static void main(String [] args){
                                new SubSubClass("ABC");
                                //notice that static blocks are only called once
                                //instance block ar called every time a new instance is created
                                new SubSubClass("Bcd");
                }
}
