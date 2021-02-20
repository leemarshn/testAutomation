package com.company.methodsnencapsulation;

public class Outer {
    int outer_x = 100;

    void test() {
        for(int i=0; i<10; i++) {
            class Inner {
                public String name = "LeeN";
                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }

            Inner inner = new Inner();
            inner.display();
//            System.out.println(inner.name);
        }
    }
}

class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
