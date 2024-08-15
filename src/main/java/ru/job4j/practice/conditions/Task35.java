package ru.job4j.practice.conditions;

public class Task35 {
    public static void gradeCheck(int grade) {
        System.out.println(grade <= 5 && grade >= 1 ? "Да" : "Нет");
    }
}
