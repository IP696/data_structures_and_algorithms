package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void listWithoutItemsIsEmpty() {
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void listWithOneItemIsNotEmpty() {
        linkedList.addFirst(1);

        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void emptyListSizeIsZero() {
        assertEquals(0, linkedList.size());
    }

    @Test
    public void listWithOneItemSizeIsOne() {
        linkedList.addFirst(1);

        assertEquals(1, linkedList.size());
    }

    @Test
    public void deleteFirstItemFromListWithOneItem() {
        linkedList.addFirst(1);

        Integer deletedItem = linkedList.deleteFirst();

        assertEquals(new Integer(1),deletedItem);
        assertTrue(linkedList.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteFirstItemFromEmptyListShouldThrowException() {
        linkedList.deleteFirst();
    }
}
