package ru.job4j.practice.conditions;

public class Task63 {
    public static void isDecreasing(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        System.out.println(num1 > num2 && num2 > num3 ? "Да" : "Нет");
    }
}
