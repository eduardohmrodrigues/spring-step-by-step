package com.ehmr.spring.basics.springstepbystep.algorithms.sort;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] arr) {
        // Implement quick sort algorithm instead of this default impl
        Arrays.sort(arr);
        return arr;
    }
}
