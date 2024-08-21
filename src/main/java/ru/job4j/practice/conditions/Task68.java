package ru.job4j.practice.conditions;

public class Task68 {
    public static void isTriangle(int a, int b, int c) {
        System.out.println(a + b > c && a + c > b && b + c > a ? "Да" : "Нет");
    }
}
