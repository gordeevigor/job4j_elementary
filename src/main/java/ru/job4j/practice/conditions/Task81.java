package ru.job4j.practice.conditions;

public class Task81 {
    public static void isLatin(char s) {
        System.out.println(s >= 65 && s <= 90 || s >= 97 && s <= 122 ? "Да" : "Нет");
    }
}
