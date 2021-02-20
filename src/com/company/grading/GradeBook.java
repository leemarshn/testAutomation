package com.company.grading;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args) {
        Map<String, Integer> original = TestResults.getOriginalGrades();
        Map <String, Integer> makeup = TestResults.getMakeUpGrades();

        for(var student: makeup.entrySet()){

            Integer firstGrade  = original.get(student.getKey());
            Integer secondGrade = makeup.get(student.getKey());

            if (secondGrade > firstGrade){
                original.put(student.getKey(), secondGrade);
            }
        }

        System.out.println("Final Grade");

        original.forEach((v,k) -> System.out.println("Student: " + k + " Grade: " + v));

    }
}
