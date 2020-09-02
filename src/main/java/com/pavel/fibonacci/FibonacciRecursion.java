package com.pavel.fibonacci;

public class FibonacciRecursion implements Fibonacci{

    public int getResult(int n) {
        if (n <= 1) return n;
        return getResult(n - 1) + getResult(n - 2);
    }
}
