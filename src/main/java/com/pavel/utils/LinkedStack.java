package com.pavel.utils;

public class LinkedStack<T> implements Stack<T> {
    private final LinkedList<T> list;

    public LinkedStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T value) {
        list.addFirst(value);
    }

    @Override
    public T pop() {
        return list.deleteFirst();
    }
}
