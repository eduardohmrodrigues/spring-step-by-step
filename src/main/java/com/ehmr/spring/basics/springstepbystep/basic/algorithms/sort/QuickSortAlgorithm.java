package com.ehmr.spring.basics.springstepbystep.basic.algorithms.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Primary
@Qualifier("quicksort")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] arr) {
        // Implement quick sort algorithm instead of this default impl
        Arrays.sort(arr);
        return arr;
    }
}
