package com.pavel.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ListInsertSorterTest {

    @Test
    public void sort() {
        Integer[] unsortedItems = new Integer[]{2, 3, 1, 7, 6, 9, 5, 8, 0, 4};
        Integer[] expectedSortedItems = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        ListInsertSorter sorter = new ListInsertSorter(unsortedItems);

        Integer[] sortedItems = sorter.sortAndGet();

        assertArrayEquals(expectedSortedItems, sortedItems);
    }
}
