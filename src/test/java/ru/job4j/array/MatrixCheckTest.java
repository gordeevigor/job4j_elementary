package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixCheckTest {
    @Test
    public void when1RowHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void when1RowHasNoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void when0RowHasNoMonoHorizontal() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void when0RowHasMonoHorizontal() {
        char[][] input = {
                {'X', 'X', 'X', 'X'},
                {'X', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }
}