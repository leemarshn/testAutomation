package com.company.inheritances;

public class Constructors1 {
    public static void main(String[] args) {
        C c = new C();
        c.myAge(12);
        B b = new B();
        b.myAge(18);
        System.out.println(c.age);
    }
//    C c = new C();
}

class AA{
    int age;
    AA(){
        System.out.println("A");
    }
}
class B extends AA{

    B(){
        System.out.println("BBBBBBBBBBBB");
    }
    int myAge(int a){
        return super.age = a;
    }
}
class  C extends AA{
    int myAge(int a){
        return super.age = a;
    }
    C(){
        System.out.println("CCCCCCCCC");
    }
}
