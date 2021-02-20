package com.company.lamdas;

public class LambdaFactorial {

    public static void main(String[] args) {
        MyInt<Integer> fact;
        fact = (n) -> {
            int results =1;

            for (int i=1; i<=n; i++)
                results = i*results;

            return results;
        };

        System.out.println(fact.getFactorial(10));
    }
}
