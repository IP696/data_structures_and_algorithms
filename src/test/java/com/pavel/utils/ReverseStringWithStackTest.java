package com.pavel.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringWithStackTest {

    @Test
    public void revertString() {
        assertEquals("tset", reverseString("test"));
        assertEquals("54321", reverseString("12345"));
        assertEquals("levaP", reverseString("Pavel"));
        assertEquals("696pi", reverseString("ip696"));
    }

    private String reverseString(String targetString) {
        Stack<Character> stack = new LinkedStack<>();
        for (char symbol : targetString.toCharArray()) {
            stack.push(symbol);
        }

        StringBuilder reversedString = new StringBuilder();

        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
}
