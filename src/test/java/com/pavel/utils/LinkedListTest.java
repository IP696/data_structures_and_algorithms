package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList<>();
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

        assertEquals(new Integer(1), deletedItem);
        assertTrue(linkedList.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void deleteFirstItemFromEmptyListShouldThrowException() {
        linkedList.deleteFirst();
    }

    @Test
    public void listContainsValue() {
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);

        assertTrue(linkedList.contains(2));
    }

    @Test
    public void listDoesNotContainValue() {
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);

        assertFalse(linkedList.contains(4));
    }
}
