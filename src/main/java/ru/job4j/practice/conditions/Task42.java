package ru.job4j.practice.conditions;

public class Task42 {
    public static void isPairSymmetric(int number) {
        int num1, num2, num3, num4;
        num1 = number / 1000;
        num2 = number % 1000 / 100;
        num3 = (number % 100) / 10;
        num4 = (number % 10) % 10;
        System.out.println((num1 * 10 + num2) == (num3 * 10 + num4) ? "Да" : "Нет");
    }
}
