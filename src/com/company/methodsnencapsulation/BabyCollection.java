package com.company.methodsnencapsulation;

public class BabyCollection extends Clothes{
    private String design;
    private String pattern;

    public BabyCollection(String name, String category, String tags, double retail_price, double supply_price, int size, String color, String design, String pattern) {
        super(name, category, tags, retail_price, supply_price, size, color);
        this.design = design;
        this.pattern = pattern;
    }

    public void babyMe(){
        System.out.println("Im Baby");
    }
}
