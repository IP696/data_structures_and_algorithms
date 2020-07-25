package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedStackTest {

    private LinkedStack<Integer> linkedStack;

    @Before
    public void setUp() {
        linkedStack = new LinkedStack<>();
    }

    @Test
    public void isEmptyTrue() {
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        linkedStack.push(1);

        assertFalse(linkedStack.isEmpty());
    }

    @Test
    public void pop() {
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);

        Integer poppedValue = linkedStack.pop();

        assertEquals(new Integer(3), poppedValue);
        assertFalse(linkedStack.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void popFromEmptyStackShouldThrowException() {
        linkedStack.pop();
    }
}
