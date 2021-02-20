package com.company.methodsnencapsulation;

public class Products {
    private String name;
    private String category;
    private String tags;
    private double retail_price;
    private double supply_price;


    public Products(String name, String category, String tags, double retail_price, double supply_price) {
        this.name = name;
        this.category = category;
        this.tags = tags;
        this.retail_price = retail_price;
        this.supply_price = supply_price;
    }

    public double calculateWholesalePrice(){
        return supply_price;
    }

    public void ProduceMe(){
        System.out.println("I'm the king");
    }

}
