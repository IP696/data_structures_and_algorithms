package com.pavel.utils;

public interface Queue<T> {
    boolean isEmpty();

    void insert(T value);

    boolean isFull();

    T remove();

    int size();

    T peekFront();
}
