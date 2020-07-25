package com.pavel.utils;

public class ArrayStack<T> implements Stack<T> {
    private final Object[] array;
    private int top;

    public ArrayStack(int size) {
        array = new Object[size];
        top = -1;
    }

    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(T value) {
        array[++top] = value;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    @Override
    public T pop() {
        return (T) array[top--];
    }

    public T peek() {
        return (T) array[top];
    }
}
