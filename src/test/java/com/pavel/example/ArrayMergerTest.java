package com.pavel.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMergerTest {

    @Test
    public void arrayMergerShouldBeCreated() {
        ArrayMerger arrayMerger = new ArrayMerger();

        assertNotNull(arrayMerger);
    }

    @Test
    public void arrayMergerShouldReturnMergedArray() {
        ArrayMerger arrayMerger = new ArrayMerger();
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2, 4};
        int[] merged = arrayMerger.merge(a, b);

        int[] expected = {1, 2, 3, 4};

        assertArrayEquals(expected, merged);
    }
}
