package com.company.inheritances;

public class Shirt  extends Product{

    int num;

    public static void main(String[] args) {
        Product official = new Shirt();
        Product prod = new Product();

        //casting
        Shirt shirts = (Shirt) official;
        //these will throw an exception
        Shirt shirt = (Shirt) prod;
        shirts.butttons();

        wash();

    }

    /**
     * STATIC METHODS
     *
     * cannot refer to this or super keywords
     * they can only access directly static methods of their class
     *
     *
     * */

    static int iron(){

        return Product.iron;

    }

    int iron(int y){
        return this.num;
    }


    private   int getCode(){
        return this.code;
    }


    public double getSalePrice(Double sp){
        return 0.0;
    }

    public static   void wash(){
        System.out.println("use water only");
    }

    public void butttons(){
        System.out.println("known to shirts only");
    }


}
