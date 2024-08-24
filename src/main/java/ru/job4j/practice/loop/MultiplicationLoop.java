package ru.job4j.practice.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int result = 1;
        for (int i = a; i <= b; i++) {
            result *= i;
        }
        return result;
    }
}
