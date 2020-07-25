package com.pavel.example;

import com.pavel.utils.Stack;

public class StringReverser {
    private final Stack<Character> stack;

    public StringReverser(Stack<Character> stack) {
        this.stack = stack;
    }

    public String reverseString(String targetString) {
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
