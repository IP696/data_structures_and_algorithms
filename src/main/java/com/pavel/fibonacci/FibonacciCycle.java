package com.pavel.fibonacci;

public class FibonacciCycle implements Fibonacci {
    public int getResult(int n) {
        if (n <= 1) return n;

        int one = 0;
        int two = 1;

        for (int i = 2; i <= n; i++) {
            int result = one + two;
            one = two;
            two = result;
        }

        return two;
    }
}
