package com.pavel.factorial;

public class FactorialCycle implements Factorial {

    public int getResult(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
