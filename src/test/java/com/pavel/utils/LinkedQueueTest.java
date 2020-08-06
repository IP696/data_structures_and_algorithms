package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedQueueTest {

    private LinkedQueue<Integer> queue;

    @Before
    public void setUp() {
        queue = new LinkedQueue<>(3);
    }

    @Test
    public void isEmptyTrue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        queue.insert(1);

        assertFalse(queue.isEmpty());
    }

    @Test
    public void isFullTrue() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        assertTrue(queue.isFull());
    }

    @Test
    public void isFullFalse() {
        assertFalse(queue.isFull());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void insertMoreThanMaxSizeShouldThrowException() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
    }

    @Test(expected = NoSuchElementException.class)
    public void removeFromEmptyQueueShouldThrowException() {
        queue.remove();
    }

    @Test
    public void removeFromQueueWithOneItem() {
        queue.insert(1);

        assertEquals(new Integer(1), queue.remove());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void removeFromQueueWithTwoItem() {
        queue.insert(1);
        queue.insert(2);

        assertEquals(new Integer(1), queue.remove());
        assertEquals(new Integer(2), queue.remove());
    }

    @Test
    public void size() {
        queue.insert(1);

        assertEquals(1, queue.size());
    }

    @Test
    public void peekFrontFromQueueWithOneItem() {
        queue.insert(1);

        assertEquals(new Integer(1), queue.peekFront());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void peekFrontFromEmptyQueueShouldReturnNull() {
        assertNull(queue.peekFront());
    }
}