package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0To5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3To8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1To1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when7To4Then0() {
        int start = 7;
        int finish = 4;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom0To10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom0To5Then6() {
        int start = 0;
        int finish = 5;
        int expected = 6;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom4To12Then40() {
        int start = 4;
        int finish = 12;
        int expected = 40;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom6To6Then6() {
        int start = 6;
        int finish = 6;
        int expected = 6;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom12To5Then0() {
        int start = 12;
        int finish = 5;
        int expected = 0;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus11To5ThenMinus24() {
        int start = -11;
        int finish = 5;
        int expected = -24;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}