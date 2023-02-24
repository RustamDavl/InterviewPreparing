package com.rustdv.datastructure;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MLinkedListTest {

    private MLinkedList<Integer> linkedList;

    @BeforeEach
    void createListInstance() {
        linkedList = new MLinkedList<>();
    }

    @Test
    void checkCorrectnessOfDependency() {
        assertTrue(true);
    }

    @Test
    void checkInsertMethod() {

        linkedList.insert(10);
        linkedList.insert(2);
        linkedList.insert(13);
        linkedList.insert(121);
        linkedList.insert(67);
        linkedList.display();
        Assertions.assertThat(linkedList.size()).isEqualTo(5);

    }


}