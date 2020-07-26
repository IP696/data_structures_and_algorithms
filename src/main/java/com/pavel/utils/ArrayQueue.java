package com.pavel.utils;

public class ArrayQueue<T> {

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

    public boolean isEmpty() {
        return nItems == 0;
    }

    public void insert(T value) {
        if (isFull()) throw new IndexOutOfBoundsException();
        if (rear == maxSize - 1) rear = -1;
        array[++rear] = value;
        nItems++;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public T remove() {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        T temp = (T) array[front++];
        if (front == maxSize) front = 0;
        nItems--;
        return temp;
    }

    public int size() {
        return nItems;
    }

    public T peekFront() {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        return (T) array[front];
    }
}
