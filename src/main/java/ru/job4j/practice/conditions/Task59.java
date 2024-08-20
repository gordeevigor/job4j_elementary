package ru.job4j.practice.conditions;

public class Task59 {
    public static void getLinearEquation(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        } else if (a == 0) {
            System.out.println("Нет решения");
        } else if (b == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1 * ((double) b / (double) a));
        }
    }
}