package com.rustdv.searching;

import com.rustdv.datastructure.MLinkedList;

public class HashTable<T> {

    private MLinkedList<T>[] elements;

    private int amountOfLists;

    public HashTable() {
        elements = new MLinkedList[997];
        amountOfLists = 0;
    }

    private int hash(T value) {
        return (value.hashCode() & 0x7fffffff) % elements.length;
    }

    public void insert(T value) {
        int hash = hash(value);
        if (elements[hash] == null) {
            elements[hash] = new MLinkedList<>(value);
            amountOfLists++;
        } else {
            var current = elements[hash].getFirst();
            while (current.getNext() != null) {

                current = current.getNext();

            }
            var list = new MLinkedList<T>();
            var node = list.new Node(value);
            current.setNext(node);

        }
    }

    public int getAmountOfLists() {
        return amountOfLists;
    }

    public void displayElementsByKey(T key) {
        var hash = hash(key);
        var current = elements[hash].getFirst();
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
    }

    public MLinkedList<T> getListByKey(T val) {
        var hash = hash(val);
        return elements[hash];

    }

    public int getListSizeByKey(T val) {
        var hash = hash(val);
        return elements[hash].size();
    }

}
