package com.ehmr.spring.basics.springstepbystep.basic.algorithms.search;

import com.ehmr.spring.basics.springstepbystep.basic.algorithms.sort.SortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
public class BinarySearchImpl implements SearchAlgorithm {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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

    @PostConstruct
    public void postConstruct() {
        logger.info("BinarySearchImpl postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("BinarySearchImpl preDestroy");
    }
}
