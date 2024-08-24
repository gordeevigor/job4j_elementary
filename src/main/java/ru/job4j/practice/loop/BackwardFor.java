package ru.job4j.practice.loop;

public class BackwardFor {
    public static void out(int m, int n) {
        for (int i = n; i < m; i++) {
            System.out.println(m + 1 - i);
        }
    }
}
