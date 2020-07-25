package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {

    private ArrayStack<Integer> arrayStack;

    @Before
    public void setUp() {
        arrayStack = new ArrayStack<>(3);
    }

    @Test
    public void size() {
        assertEquals(3, arrayStack.size());
    }

    @Test
    public void isEmptyTrue() {
        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        arrayStack.push(1);

        assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void isFullTrue() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        assertTrue(arrayStack.isFull());
    }

    @Test
    public void isFullFalse() {
        arrayStack.push(1);
        arrayStack.push(2);

        assertFalse(arrayStack.isFull());
    }

    @Test
    public void pop() {
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        Integer poppedValue = arrayStack.pop();

        assertEquals(new Integer(3), poppedValue);
        assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void peek() {
        arrayStack.push(1);

        Integer peekedValue = arrayStack.peek();

        assertEquals(new Integer(1), peekedValue);
    }
}