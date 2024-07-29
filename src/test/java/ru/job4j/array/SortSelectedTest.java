package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {
    @Test
    public void whenSort3and4and1and2and5Then1and2and3and4and5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5and4and6Then4and5and6() {
        int[] data = new int[] {5, 4, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort120and11and2and24and55Then2and11and24and55and120() {
        int[] data = new int[] {120, 11, 2, 24, 55};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 11, 24, 55, 120};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort7and11Then7and11() {
        int[] data = new int[] {7, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 11};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort34and11Then11and34() {
        int[] data = new int[] {34, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 34};
        assertThat(result).containsExactly(expected);
    }
}