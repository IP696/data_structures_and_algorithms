package com.pavel.utils;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int count = 0;
        Node current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public int removeFirst() {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp.value;
    }

    public int removeLast() {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node temp = last;
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp.value;
    }

    public boolean contains(int value) {
        Node current = this.first;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    public boolean addAfter(int value, int newValue) {
        Node current = first;
        while (current.value != value) {
            current = current.next;
            if (current == null) return false;
        }

        Node newNode = new Node(newValue);
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

    public int deleteKey(int value) {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node current = this.first;
        while (current.value != value) {
            current = current.next;
            if (current == null) return -1;
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

    private static class Node {
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }
    }
}
