package com.pavel.example;

public class RecursivelyBinarySearcher {

    private final int[] arr;

    public RecursivelyBinarySearcher(int[] arr) {
        this.arr = arr;
    }

    public int find(int searchValue) {
        return recFind(0, arr.length-1, searchValue);
    }

    private int recFind(int lowerBound, int upperBound, int searchValue) {
        int current = (lowerBound + upperBound) / 2;

        if (arr[current] == searchValue) return current;
        if (lowerBound > upperBound) return -1;

        if (searchValue > arr[current]) {
            return recFind(current + 1, upperBound, searchValue);
        } else {
            return recFind(lowerBound, current - 1, searchValue);
        }
    }
}
