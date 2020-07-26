package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {

    private ArrayQueue<Integer> arrayQueue;

    @Before
    public void setUp() {
        arrayQueue = new ArrayQueue<>(3);
    }

    @Test
    public void isEmptyTrue() {
        assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        arrayQueue.insert(1);

        assertFalse(arrayQueue.isEmpty());
    }

    @Test
    public void isFullTrue() {
        arrayQueue.insert(1);
        arrayQueue.insert(2);
        arrayQueue.insert(3);

        assertTrue(arrayQueue.isFull());
    }

    @Test
    public void isFullFalse() {
        assertFalse(arrayQueue.isFull());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void insertMoreThanMaxSizeShouldThrowException() {
        arrayQueue.insert(1);
        arrayQueue.insert(2);
        arrayQueue.insert(3);
        arrayQueue.insert(4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeFromEmptyQueueShouldThrowException() {
        arrayQueue.remove();
    }

    @Test
    public void removeFromQueueWithOneItem() {
        arrayQueue.insert(1);

        Integer removedValue = arrayQueue.remove();

        assertEquals(new Integer(1), removedValue);
        assertTrue(arrayQueue.isEmpty());
    }

    @Test
    public void size() {
        arrayQueue.insert(1);

        assertEquals(1, arrayQueue.size());
    }

    @Test
    public void peekFrontFromQueueWithOneItem() {
        arrayQueue.insert(1);

        assertEquals(new Integer(1), arrayQueue.peekFront());
        assertFalse(arrayQueue.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void peekFrontFromEmptyQueueShouldThrowException() {
        arrayQueue.peekFront();
    }
}
