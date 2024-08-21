package ru.job4j.practice.conditions;

public class Task73 {
    public static void midDigitLess(int num) {
        int num1, num2, num3;
        num1 = num / 100;
        num2 = num % 100 / 10;
        num3 = (num % 10) % 10;
        System.out.println(num2 < num1 && num2 < num3 ? "Да" : "Нет");
    }
}
