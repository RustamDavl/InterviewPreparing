package com.rustdv.searching;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashTableTest {

    private HashTable<Integer> hashTable;

    @BeforeEach
    void createHTInstance() {
        hashTable = new HashTable<>();
    }

    @Test
    void checkInsertMethod() {
        hashTable.insert(67);
        hashTable.insert(89);
        hashTable.insert(56);
        hashTable.insert(34);
        hashTable.insert(56);
        hashTable.insert(7);
        hashTable.insert(7);
        hashTable.insert(7);
        hashTable.insert(7);
        hashTable.displayElementsByKey(7);

    }

    @Test
    void checkCorrectnessOfListSize() {
        hashTable.insert(67);
        hashTable.insert(89);
        hashTable.insert(56);
        hashTable.insert(34);
        hashTable.insert(56);
        hashTable.insert(7);
        hashTable.insert(7);
        hashTable.insert(7);
        hashTable.insert(7);
        var size = hashTable.getListByKey(7).size();
        System.out.println(size);
        Assertions.assertThat(size).isEqualTo(4);
    }

}