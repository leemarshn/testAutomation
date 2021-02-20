package com.company.inheritances;

import com.company.inheritance.Question48T3;

public class Question58T3 {
    Question58T3() {
                     System.out.print("CP ");
             }
             static{ System.out.print("SP ");}
    }

    class Student extends Question58T3 {
               Student() {
                      System.out.print("CS ");
                }

     }

    class Teacher extends Question58T3 {
               Teacher() {
                        System.out.print("CT ");
                }
                Teacher(String s){
                        System.out.print("OCT ");
                }
}
   class Whiz {
               public static void main(String [ ] args) {
                        Question58T3 p1 = new Teacher("String");
                        Student s1 = new Student();
               }
      }