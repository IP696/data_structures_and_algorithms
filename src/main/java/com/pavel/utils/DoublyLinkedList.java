package com.pavel.utils;

public class DoublyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;

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

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public T removeFirst() {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node<T> temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp.value;
    }

    public T removeLast() {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node<T> temp = last;
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp.value;
    }

    public boolean contains(T value) {
        Node<T> current = this.first;
        while (current != null) {
            if (current.value.equals(value)) return true;
            current = current.next;
        }
        return false;
    }

    public boolean addAfter(T value, T newValue) {
        Node<T> current = first;
        while (!current.value.equals(value)) {
            current = current.next;
            if (current == null) return false;
        }

        Node<T> newNode = new Node<>(newValue);
        if (current == last) {
            newNode.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    public T deleteKey(T value) {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node<T> current = first;
        while (!current.value.equals(value)) {
            current = current.next;
            if (current == null) return null;
        }

        if (current == first) {
            first = first.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = last.previous;
        } else {
            current.next.previous = current.previous;
        }
        return value;
    }

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        public Node(T value) {
            this.value = value;
        }
    }
}
