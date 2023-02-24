package com.rustdv.tasks.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {
    private Solutions solutions;

    @BeforeEach
    void createInstance() {
        solutions = new Solutions();
    }

    @Test
    void check1_1Task() {
        Solutions solutions = new Solutions();
        var string = "Difficult";
        var result = solutions.areUniqCharacters(string);
        Assertions.assertThat(result).isFalse();
    }
    @Test
    void check1_1Task2() {
        var string = "Difficult";
        var result = solutions.areUniqCharacters2(string);
        Assertions.assertThat(result).isFalse();
    }

}