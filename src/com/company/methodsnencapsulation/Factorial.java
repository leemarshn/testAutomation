package com.company.methodsnencapsulation;

public class Factorial {

 // this is a recusive function
    int fact(int n) {
        int result;
//        result = (n-1)*n;
//if (n <1){
//    return 1;
//}else {
//    for (long i = 1; i <= n; i++) {
//        System.out.println(i);
//        result *= i;
//    }
//}
//        while (n>1){
////                result = 1;
//               result += n;
//    }

        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }

}
