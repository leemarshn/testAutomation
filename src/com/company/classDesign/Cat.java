package com.company.classDesign;

public class Cat extends Animal{
     static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Cat myAnimal = myCat;
//        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
