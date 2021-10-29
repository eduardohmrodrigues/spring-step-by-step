package com.ehmr.spring.basics.springstepbystep.algorithms.search;

import com.ehmr.spring.basics.springstepbystep.algorithms.sort.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BinarySearchImpl implements SearchAlgorithm {

    @Autowired
    @Qualifier("bubblesort")
    private SortAlgorithm sortAlgorithm;

    public int search(int[] arr, int number) {
//        System.out.println(sortAlgorithm);

        // Sort the array elements
        int[] sorted = sortAlgorithm.sort(arr);

        // Search the array with binary search instead of this default imlp
        int res = Arrays.binarySearch(sorted, number);

        // Return the result
        return res;
    }
}
