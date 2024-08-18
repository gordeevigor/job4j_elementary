package ru.job4j.practice.conditions;

public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        System.out.println(a < b + c && b < a + c && c < a + b ? "Да" : "Нет");
    }
}
