package com.company.inheritances;

public class TestClassRepo implements testRepository, testRepo2{

    public void sayMyName(){
        System.out.println("My Name is Test Repo");
//        testRepo2.super.isEatTime();
    }

    public void isEatTime(){
        System.out.println("let me eat");
    }

    public static void main(String[] args) {
        testRepository tr = new TestClassRepo();





        tr.isEatTime();
    }
}
