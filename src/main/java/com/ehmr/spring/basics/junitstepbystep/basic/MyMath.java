package com.ehmr.spring.basics.junitstepbystep.basic;

public class MyMath {

    int sum(int[] numbers) {
        int res = 0;
        for(int i=0; i<numbers.length; ++i) {
            res += numbers[i];
        }

        return res;
    }
}
