package ru.job4j.practice.conditions;

public class LogicOr {
    public static boolean check(int num) {
        return num < 0 || num % 2 != 0;
    }
}
