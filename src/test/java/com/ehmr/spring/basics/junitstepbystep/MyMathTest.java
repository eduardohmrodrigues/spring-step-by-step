package com.ehmr.spring.basics.junitstepbystep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    public void testSumWithoutNumbers() {
        // Given
        int[] numbers = new int[0];
        int expected = 0;

        // When
        int actual = myMath.sum(numbers);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWith1Number() {
        // Given
        int[] numbers = new int[]{1};
        int expected = 1;

        // When
        int actual = myMath.sum(numbers);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithMultipleNumbers() {
        // Given
        int[] numbers = new int[]{1, 2, 3};
        int expected = 6;

        // When
        int actual = myMath.sum(numbers);

        // Then
        assertEquals(expected, actual);
    }
}
