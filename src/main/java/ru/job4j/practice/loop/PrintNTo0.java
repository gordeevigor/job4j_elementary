package ru.job4j.practice.loop;

public class PrintNTo0 {
    public static void out(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n - 1 - i);
        }
    }
}
