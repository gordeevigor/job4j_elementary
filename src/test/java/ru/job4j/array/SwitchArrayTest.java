package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {
    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to7() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int source = 3;
        int destination = 7;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {9, 8, 7, 2, 5, 4, 3, 6, 1, 0};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap4to5() {
        int[] input = {11, 2, 0, 3, 26, 42, 233, 12};
        int source = 4;
        int destination = 5;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {11, 2, 0, 3, 42, 26, 233, 12};
        assertThat(result).containsExactly(expected);
    }
}