package ru.job4j.practice.conditions;

public class Task58 {
    public static void isWinning(int number) {
        int num1, num2, num3, num4, num5, num6;
        num1 = number / 100000;
        num2 = (number % 100000) / 10000;
        num3 = (number % 10000) / 1000;
        num4 = ((number % 1000) / 100) % 10;
        num5 = (((number % 100) / 10) % 10);
        num6 = number % 100000 % 10;

        System.out.println((num1 + num2 + num3 == num4 + num5 + num6
                && (num1 + num2 + num3) % 2 == 0) ? "Да" : "Нет");
    }
}
