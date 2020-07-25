package com.pavel.utils;

import com.pavel.example.StringReverser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverserTest {

    @Test
    public void reverseStringByLinkedStack() {
        StringReverser reverser = new StringReverser(new LinkedStack<>());
        assertEquals("tset", reverser.reverseString("test"));
        assertEquals("54321", reverser.reverseString("12345"));
        assertEquals("levaP", reverser.reverseString("Pavel"));
        assertEquals("696pi", reverser.reverseString("ip696"));
    }

    @Test
    public void reverseStringByArrayStack() {
        //100 size is not good solution
        StringReverser reverser = new StringReverser(new ArrayStack<>(100));
        assertEquals("tset", reverser.reverseString("test"));
        assertEquals("54321", reverser.reverseString("12345"));
        assertEquals("levaP", reverser.reverseString("Pavel"));
        assertEquals("696pi", reverser.reverseString("ip696"));
    }
}
