package com.pavel.utils;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    private Node<T> first;

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = first;
        first = newNode;
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

    public T deleteFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        Node<T> temp = first;
        first = first.next;
        return temp.value;
    }

    public boolean contains(T value) {
        Node<T> current = first;
        while (!current.value.equals(value)) {
            if (current.next == null) return false;
            current = current.next;
        }
        return true;
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
