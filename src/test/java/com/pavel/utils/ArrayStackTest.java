package com.pavel.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {

    @Test
    public void stackCanBeCreated() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);

        assertNotNull(arrayStack);
    }

    @Test
    public void size() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);

        assertEquals(5, arrayStack.size());
    }

    @Test
    public void isEmptyTrue() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);

        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);

        arrayStack.push(1);

        assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void isFullTrue() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(3);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        assertTrue(arrayStack.isFull());
    }

    @Test
    public void isFullFalse() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        assertFalse(arrayStack.isFull());
    }

    @Test
    public void pop() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        Integer poppedValue = arrayStack.pop();

        assertEquals(new Integer(3), poppedValue);
        assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void peek() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.push(1);

        Integer peekedValue = arrayStack.peek();

        assertEquals(new Integer(1), peekedValue);
    }
}