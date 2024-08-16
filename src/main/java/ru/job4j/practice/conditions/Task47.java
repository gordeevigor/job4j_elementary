package ru.job4j.practice.conditions;

public class Task47 {
    public static void changeNum(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        if (number > 500) {
            System.out.println(num3 * 100 + num2 * 10 + num1);
        } else {
            System.out.println(num1 * 100 + num3 * 10 + num2);
        }
    }
}
