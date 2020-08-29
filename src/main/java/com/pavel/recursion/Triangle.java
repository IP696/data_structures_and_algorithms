package com.pavel.recursion;

public class Triangle {
    public int getResult(int n) {
        if (n == 1) return 1;
        return n + getResult(n - 1);
    }
}
