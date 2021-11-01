package com.ehmr.spring.basics.springstepbystep.basic.algorithms.search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXMLConfigurationTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        // Given
        // We expect it to be on position 1 because the binary search
        // algorithm sorts the input array to find the expected number
        int number = 3;
        int[] numbers = new int[]{1, 4, number};
        int expectedIndex = 1;

        // When
        int actualIndex = binarySearch.search(numbers, 3);

        // Then
        assertEquals(expectedIndex, actualIndex);
    }
}
