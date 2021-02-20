package com.company.importStaic;

public class UseStatic {
   static int age = 14;
   public String name = "LeeN";

    public static int  getAge(int age){
        return age;
    }
    public String getName(){
        int k = randomNo();
        return this.name;
    }

    public static int num(){
        return new UseStatic().randomNo();
    }
    public int randomNo(){
        return 10;
    }

}
