package com.pavel.factorial;

public class FactorialRecursion implements Factorial {
    public int getResult(int n) {
        if (n == 0) return 1;
        return n * getResult(n - 1);
    }
}
