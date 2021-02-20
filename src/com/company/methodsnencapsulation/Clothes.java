package com.company.methodsnencapsulation;

public class Clothes extends Products {

    private int size;
    private String color;

    public Clothes(String name, String category, String tags, double retail_price, double supply_price, int size, String color) {
        super(name, category, tags, retail_price, supply_price);
        this.size = size;
        this.color = color;
    }

    public String findMaterial(){
        return "Material";
    }

    public void ClotheMe(){
        System.out.println("Clothe Me");
    }
}
