package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus20to3Minus1then5dot099() {
        Point a = new Point(-2, 0);
        Point b = new Point(3, -1);
        double expected = 5.099;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when002To246then6dot0() {
        Point a = new Point(0, 0, 2);
        Point b = new Point(2, 4, 6);
        double expected = 6.000;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when03Minus2ToMinus10Minus4then3dot742() {
        Point a = new Point(0, 3, -2);
        Point b = new Point(-1, 0, -4);
        double expected = 3.742;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}