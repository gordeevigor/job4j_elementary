package ru.job4j.practice.conditions;

public class Task48 {
    public static void changeNum(int num1, double num2, int num3) {
        if (num1 % 2 == 0) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 + num3);
        }
    }
}
