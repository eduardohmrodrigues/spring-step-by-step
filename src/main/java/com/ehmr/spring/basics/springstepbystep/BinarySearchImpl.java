package com.ehmr.spring.basics.springstepbystep;

import java.util.Arrays;

public class BinarySearchImpl {
        public int binarySearch(int[] arr, int number) {
            // Implement sorting algorithm
            BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
            int[] sorted = bubbleSortAlgorithm.sort(arr);

            // Search the array with binary search instead of this default imlp
            int res = Arrays.binarySearch(sorted, number);

            // Return the result
            return res;
        }
}
