package ru.job4j.practice.conditions;

public class Task41 {
    public static void evenDigitsAmount(int number) {
        System.out.println(3 - (number / 100) % 2 - (number % 100 / 10) % 2 - ((number % 10) % 10) % 2);
    }
}