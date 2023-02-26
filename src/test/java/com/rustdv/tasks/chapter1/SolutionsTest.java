package com.rustdv.tasks.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
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
        assertThat(result).isFalse();
    }
    @Test
    void check1_1Task2() {
        var string = "Difficult";
        var result = solutions.areUniqCharacters2(string);
        assertThat(result).isFalse();
    }

    @Test
    void check1_2Task() {
        var str1 = "dogdogggo ";
        var str2 = "ogodd oggg";
        boolean actualResult = solutions.arePermutations(str1, str2);
        boolean expectedResult = true;
        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    void check1_2Task2() {
        var str1 = " dogdogggo ";
        var str2 = "ogodd  oggg";
        boolean actualResult = solutions.arePermutations2(str1, str2);
        boolean expectedResult = true;
        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    void check1_4Task() {
        var str = "btactcobbaaaooiib";
        var actualResult = solutions.isPermutationOfPalindrome(str);
        var expectedResult = true;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

}