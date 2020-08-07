package com.pavel.example;

import com.pavel.utils.SortedList;

public class ListInsertSorter {
    private final Integer[] unsortedItems;

    public ListInsertSorter(Integer[] unsortedItems) {
        this.unsortedItems = unsortedItems;
    }

    public Integer[] sortAndGet() {
        SortedList<Integer> list = new SortedList<>();
        for (Integer item : unsortedItems) {
            list.add(item);
        }

        Integer[] sortedArray = new Integer[unsortedItems.length];

        int index = 0;
        while (!list.isEmpty()) {
            sortedArray[index++] = list.deleteFirst();
        }

        return sortedArray;
    }
}
