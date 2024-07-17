package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  whenMax7To3Then7() {
        int left = 7;
        int right = 3;
        int expected = 7;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when8To10Then10() {
        int left = 8;
        int right = 10;
        int expected = 10;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  when9To9Then9() {
        int left = 9;
        int right = 9;
        int expected = 9;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }
}