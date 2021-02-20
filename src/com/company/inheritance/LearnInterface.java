package com.company.inheritance;

 class LearnInterface {
     public static void main(String[] args) {
//         int a = 10;
//a = ++a + a + a-- - --a + a++;
//System.out.println (a);

         Interfaces1 wed = new Interfaces1() {
         };

         AbstractClass ab = new AbstractClass() {
             @Override
             public int hashCode() {
                 return super.hashCode();
             }
         };


        String[] names = {"Lee", "Wambui", "Shiru", "Macharia"};
        for (String name: names)
            System.out.println(name);

     }
}
