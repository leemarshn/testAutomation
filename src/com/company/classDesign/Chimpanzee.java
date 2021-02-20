package com.company.classDesign;

class Primate {
    public Primate() {
        System.out.println("Primate");
    }
    public Primate(int y){
        System.out.println("mock");
    }
}
class Ape extends Primate {


    public Ape() {
        super(8);
        System.out.println("Ape");
    }

//    private int child(){
////        super(8);
//        return  super(8);
//    }
}
public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();
    }
}
