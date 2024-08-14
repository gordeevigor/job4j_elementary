package ru.job4j.practice.conditions;

public class Task28 {
    public static void isEnough(int pupils, int desks) {
        System.out.println(desks >= pupils / 2 ? "Да" : "Нет");
    }
}
