package ru.job4j.practice.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }
}
