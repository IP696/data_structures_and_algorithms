package com.pavel.utils;

public class SortedList<T extends Comparable<T>> {
    private Node<T> first;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> previous = null;
        Node<T> current = first;

        while (current != null && current.value.compareTo(value) < 0) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newNode;
        } else {
            previous.next = newNode;
        }
        newNode.next = current;
    }

    public T deleteFirst() {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node<T> temp = first;
        first = first.next;
        return temp.value;
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
