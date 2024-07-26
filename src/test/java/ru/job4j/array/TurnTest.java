package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOf2ElementsThenTurnedArray() {
        int[] input = new int[] {4, 1};
        int[] result = Turn.back(input);
        int[] expected = new int[] {1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithEvenAmountOf4ElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOf5ElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithEvenAmountOf6ElementsThenTurnedArray() {
        int[] input = new int[] {7, 0, 4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4, 0, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when1TurnArrayWithOddAmountOf7ElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}