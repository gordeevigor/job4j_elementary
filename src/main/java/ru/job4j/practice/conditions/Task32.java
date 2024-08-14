package ru.job4j.practice.conditions;

public class Task32 {
    public static void calculate(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 - num2);
        } else if (num2 > num1) {
            System.out.println(num2 - num1);
        } else {
            System.out.println(num1 * num2);
        }
    }
}
