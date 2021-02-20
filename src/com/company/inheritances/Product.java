package com.company.inheritances;

public class  Product {
    private  String name;
    private String category;
    private  Double salePrice;
    private  double costPrice;
    public static int  iron = 0;

    public int code=7;

    public String getName(String name){
        return name;
    }

    protected double getSalePrice(Double salePrice){
        return salePrice;
    }

   Object calculateCostPrice(Double costPrice){
        return  800.2;
    }



    public static void wash(){
        System.out.println("use water and soap");
    }
}
