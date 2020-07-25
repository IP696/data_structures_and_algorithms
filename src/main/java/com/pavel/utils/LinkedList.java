package com.pavel.utils;

public class LinkedList {
    private Node first;

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(Integer value) {
        Node newNode = new Node(value);
        newNode.next = first;
        first = newNode;
    }

    public int size() {
        int count = 0;
        Node current = this.first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Integer deleteFirst() {
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node temp = first;
        first = first.next;
        return temp.value;
    }

    private static class Node {
        Integer value;
        Node next;

        public Node(Integer value) {
            this.value = value;
        }
    }
}
