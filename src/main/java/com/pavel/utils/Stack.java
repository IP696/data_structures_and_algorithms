package com.pavel.utils;

public interface Stack<T> {
    boolean isEmpty();

    void push(T value);

    T pop();
}
