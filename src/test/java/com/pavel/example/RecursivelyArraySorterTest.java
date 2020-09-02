package com.pavel.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursivelyArraySorterTest {

    @Test
    public void findIndexByValue() {
        RecursivelyBinarySearcher binarySearcher = new RecursivelyBinarySearcher(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        assertEquals(0, binarySearcher.find(1));
        assertEquals(1, binarySearcher.find(2));
        assertEquals(2, binarySearcher.find(3));
        assertEquals(3, binarySearcher.find(4));
        assertEquals(4, binarySearcher.find(5));
        assertEquals(5, binarySearcher.find(6));
        assertEquals(6, binarySearcher.find(7));
        assertEquals(7, binarySearcher.find(8));
        assertEquals(8, binarySearcher.find(9));
        assertEquals(9, binarySearcher.find(10));
        assertEquals(-1, binarySearcher.find(11));
    }
}