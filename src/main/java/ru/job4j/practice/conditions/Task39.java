package ru.job4j.practice.conditions;

public class Task39 {
    public static void isSymmetric(int number) {
        System.out.println(number / 100 == (number % 10) % 10 ? "Да" : "Нет");
    }
}
