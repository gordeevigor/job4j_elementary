package ru.job4j.practice.conditions;

public class Task33 {
    public static void numSquare(int number) {
        System.out.println(number < 0 ? (int) Math.pow(number, 2) : "Ошибка");
    }
}
