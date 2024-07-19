package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result = i == 0 ? 1 : result * i;
            }
        return result;
    }
}
