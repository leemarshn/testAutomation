package com.company.methodsnencapsulation;

public class CallByReference {

    int a, b;

    CallByReference(int i, int j) {
        a = i;
        b = j;
    }

    CallByReference(){
        a = 10;
        b = 20;
    }

    void average(){
        System.out.println("Nothing");
        System.out.println(a*b/2);

    }
    int sum(){
        this.a = a;
        this.b = b;

        return a+b;
    }

    // pass an object
    void meth(CallByReference o) {
        o.a *= 2;
        o.b /= 2;

    }

}
