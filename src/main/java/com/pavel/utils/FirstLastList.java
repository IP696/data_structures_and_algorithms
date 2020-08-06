package com.pavel.utils;

public class FirstLastList<T> {

    private Node<T> first;
    private Node<T> last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) last = newNode;
        newNode.next = first;
        first = newNode;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
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
        if (isEmpty()) throw new IndexOutOfBoundsException();
        T temp = first.value;
        if (first.next == null) last = null;
        first = first.next;
        return temp;
    }

    public boolean contains(int value) {
        Node<T> current = first;
        while (current != null) {
            if (current.value.equals(value)) return true;
            current = current.next;
        }
        return false;
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
