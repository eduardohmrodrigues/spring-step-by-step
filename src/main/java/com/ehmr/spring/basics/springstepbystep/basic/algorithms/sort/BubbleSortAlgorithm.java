package com.ehmr.spring.basics.springstepbystep.basic.algorithms.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Qualifier("bubblesort")
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] arr) {
        // Implement bubble sort algorithm instead of this default impl
        Arrays.sort(arr);
        return arr;
    }
}
