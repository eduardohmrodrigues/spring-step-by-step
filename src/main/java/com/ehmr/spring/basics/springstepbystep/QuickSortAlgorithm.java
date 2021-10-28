package com.ehmr.spring.basics.springstepbystep;

import java.util.Arrays;

public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] arr) {
        // Implement quick sort algorithm instead of this default impl
        Arrays.sort(arr);
        return arr;
    }
}
