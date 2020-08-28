package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class FirstLastListTest {

    private FirstLastList<Integer> firstLastList;

    @Before
    public void setUp() {
        firstLastList = new FirstLastList<>();
    }

    @Test
    public void listCanBeCreated() {
        assertNotNull(firstLastList);
    }

    @Test
    public void newListIsEmpty() {
        assertTrue(firstLastList.isEmpty());
    }

    @Test
    public void listWithOneItemIsNotEmpty() {
        firstLastList.addFirst(1);

        assertFalse(firstLastList.isEmpty());
    }

    @Test
    public void newListHas0Size() {
        assertEquals(0, firstLastList.size());
    }

    @Test
    public void listWithOneItemHas1Size() {
        firstLastList.addFirst(1);

        assertEquals(1, firstLastList.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void ifListIsEmptyDeleteFirstShouldThrowException() {
        firstLastList.deleteFirst();
    }

    @Test
    public void ifListIsNotEmptyDeleteFirstShouldReturnTopItem() {
        firstLastList.addFirst(1);

        assertEquals(new Integer(1), firstLastList.deleteFirst());
    }

    @Test
    public void listContainsValue() {
        firstLastList.addFirst(1);
        firstLastList.addFirst(2);
        firstLastList.addFirst(3);

        assertTrue(firstLastList.contains(2));
    }

    @Test
    public void listDoesNotContainValue() {
        firstLastList.addFirst(1);
        firstLastList.addFirst(2);
        firstLastList.addFirst(3);

        assertFalse(firstLastList.contains(4));
    }

    @Test
    public void addLastShouldIncrementList() {
        firstLastList.addLast(1);

        assertEquals(1, firstLastList.size());
    }

    @Test
    public void addLastAndDeleteFirstShouldAddAndRemoveItem() {
        firstLastList.addLast(1);

        assertEquals(new Integer(1), firstLastList.deleteFirst());
    }

    @Test
    public void IfListIsEmptyGetFirstShouldReturnNull() {
        assertNull(firstLastList.getFirst());
    }

    @Test
    public void getFirst() {
        firstLastList.addFirst(1);

        assertEquals(new Integer(1), firstLastList.getFirst());
        assertEquals(1, firstLastList.size());
    }
}
