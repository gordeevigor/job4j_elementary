package ru.job4j.practice.conditions;

public class Task20 {
    public static void numCheck(int number) {
        if (number >= 100 && number <= 999 && number % 2 == 0 && (number / 10) % 2 == 0
                && (number / 100) % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
