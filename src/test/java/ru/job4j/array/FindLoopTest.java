package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 6, 3};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot7ThenMinus1() {
        int[] data = new int[] {5, 10, 3};
        int element = 7;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {7, 4, 5, 9, 12, 14};
        int element = 8;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot11ThenMinus1() {
        int[] data = new int[] {7, 4, 5, 9, 12, 11};
        int element = 11;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas9Then3() {
        int[] data = new int[] {7, 4, 5, 9, 12, 11};
        int element = 9;
        int start = 2;
        int finish = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas7Then2() {
        int[] data = new int[] {7, 7, 7, 7, 7, 7};
        int element = 7;
        int start = 2;
        int finish = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}