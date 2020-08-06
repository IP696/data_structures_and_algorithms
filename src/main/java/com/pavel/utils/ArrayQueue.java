package com.pavel.utils;

import java.util.NoSuchElementException;

public class ArrayQueue<T> implements Queue<T>{

    private final int maxSize;
    private final Object[] array;
    private int nItems;
    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new Object[maxSize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    @Override
    public boolean isEmpty() {
        return nItems == 0;
    }

    @Override
    public void insert(T value) {
        if (isFull()) throw new IndexOutOfBoundsException();
        if (rear == maxSize - 1) rear = -1;
        array[++rear] = value;
        nItems++;
    }

    @Override
    public boolean isFull() {
        return nItems == maxSize;
    }

    @Override
    public T remove() {
        if (isEmpty()) throw new NoSuchElementException();
        T temp = (T) array[front++];
        if (front == maxSize) front = 0;
        nItems--;
        return temp;
    }

    @Override
    public int size() {
        return nItems;
    }

    @Override
    public T peekFront() {
        if (isEmpty()) return null;
        return (T) array[front];
    }
}
