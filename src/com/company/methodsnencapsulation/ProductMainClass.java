package com.company.methodsnencapsulation;

public class ProductMainClass {
    public static void main(String[] args) {
        Products romper =  new BabyCollection("Full", "Baby", "ffjkf", 85,
                89, 5, "Blue", "Kanga", "Sozyx");


        BabyCollection romper2 =  new BabyCollection("Full", "Baby", "ffjkf", 85,
                89, 5, "Blue", "Kanga", "Sozyx");


        Clothes romper3 =  new BabyCollection("Full", "Baby", "ffjkf", 85,
                89, 5, "Blue", "Kanga", "Sozyx");

//        BabyCollection romper4 =  (BabyCollection) new Clothes("Full", "Baby", "ffjkf", 85,
//                89, 5, "Blue");

//        String name = "Name fdkfkdlkd"


        romper3.ClotheMe();
//        romper4.babyMe();

    }
}
