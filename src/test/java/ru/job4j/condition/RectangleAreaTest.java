package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {
    @Test
    void whenP6K2ThenSquare2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K8ThenSquare0dot4() {
        int p = 4;
        double k = 8;
        double expected = 0.4;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K4ThenSquare4() {
        int p = 10;
        double k = 4;
        double expected = 4;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}