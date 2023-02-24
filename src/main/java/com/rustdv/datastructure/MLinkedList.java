package com.rustdv.datastructure;

public class MLinkedList<T> {
    private int amount;
    private Node first;

    public MLinkedList() {
        first = new Node();
        amount = 0;
    }

    public MLinkedList(T value) {
        first = new Node(value);
        amount = 1;
    }

    public class Node {
        private T value;

        private Node next;

        public Node() {
        }

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
           this.next = next;
        }
    }

    public void insert(T value) {
        if(first.value == null) {
            first.setValue(value);
            amount++;
            return;
        }
        var current = first;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(value);
        amount++;
    }

    public int size() {
        int am = 0;
        var current = first;
        while (current != null) {
            am++;
            current = current.next;
        }

        return am;
    }


    public void display() {
        var current = first;
        while (current != null) {

            System.out.print(current.getValue() + " ");
            current = current.next;
        }


    }

    public Node getFirst() {
        return first;
    }


}
