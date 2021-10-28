package com.ehmr.spring.basics.springstepbystep.algorithms.sort;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] arr) {
        // Implement bubble sort algorithm instead of this default impl
        Arrays.sort(arr);
        return arr;
    }
}