package com.pavel.example;

public class ArrayMerger {
    public int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int aDex = 0;
        int bDex = 0;
        int cDex = 0;

        while (aDex < a.length && bDex < b.length) {
            if (a[aDex] < b[bDex]) {
                c[cDex++] = a[aDex++];
            } else {
                c[cDex++] = b[bDex++];
            }
        }

        while (aDex < a.length) {
            c[cDex++] = a[aDex++];
        }

        while (bDex < b.length) {
            c[cDex++] = b[bDex++];
        }
        return c;
    }
}
