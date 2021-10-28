package com.ehmr.spring.basics.springstepbystep;

import java.util.Arrays;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] arr, int number) {
        // Sort the array elements
        int[] sorted = sortAlgorithm.sort(arr);

        // Search the array with binary search instead of this default imlp
        int res = Arrays.binarySearch(sorted, number);

        // Return the result
        return res;
    }
}
