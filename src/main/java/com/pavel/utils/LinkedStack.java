package com.pavel.utils;

public class LinkedStack<T> {
    private final LinkedList<T> list;

    public LinkedStack() {
        this.list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(T value) {
        list.addFirst(value);
    }

    public T pop() {
        return list.deleteFirst();
    }
}
