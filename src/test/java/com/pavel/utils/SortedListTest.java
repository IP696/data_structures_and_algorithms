package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {

    private SortedList<Integer> sortedList;

    @Before
    public void setUp() {
        sortedList = new SortedList<>();
    }

    @Test
    public void listShouldBeCreated() {
        assertNotNull(sortedList);
    }

    @Test
    public void newListShouldBeEmpty() {
        assertTrue(sortedList.isEmpty());
    }

    @Test
    public void newListShouldHave0Size() {
        assertEquals(0, sortedList.size());
    }

    @Test
    public void listWithOneItemShouldBeNotEmpty() {
        sortedList.add(1);

        assertFalse(sortedList.isEmpty());
    }

    @Test
    public void listWithOneItemShouldHave1Size() {
        sortedList.add(1);

        assertEquals(1, sortedList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteFirstOneItemFromEmptyListShouldThrowsException() {
        sortedList.deleteFirst();
    }

    @Test
    public void listShouldBeEmptyAndHave0SizeAfterDeletingFirstFromListWithOneItem() {
        sortedList.add(1);

        assertEquals(new Integer(1), sortedList.deleteFirst());
        assertTrue(sortedList.isEmpty());
    }

    @Test
    public void itemsShouldBeSorted() {
        sortedList.add(3);
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(5);
        sortedList.add(7);
        sortedList.add(9);
        sortedList.add(0);

        assertEquals(new Integer(0), sortedList.deleteFirst());
        assertEquals(new Integer(1), sortedList.deleteFirst());
        assertEquals(new Integer(2), sortedList.deleteFirst());
        assertEquals(new Integer(3), sortedList.deleteFirst());
        assertEquals(new Integer(5), sortedList.deleteFirst());
        assertEquals(new Integer(7), sortedList.deleteFirst());
        assertEquals(new Integer(9), sortedList.deleteFirst());
    }
}
