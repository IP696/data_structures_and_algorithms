package com.pavel.utils;

import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queue<T> {
    private final FirstLastList<T> list = new FirstLastList<>();
    private final int maxSize;

    public LinkedQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void insert(T value) {
        if (isFull()) throw new IndexOutOfBoundsException();
        list.addLast(value);
    }

    @Override
    public boolean isFull() {
        return list.size() == maxSize;
    }

    @Override
    public T remove() {
        if (isEmpty()) throw new NoSuchElementException();
        return list.deleteFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public T peekFront() {
        return list.getFirst();
    }
}
