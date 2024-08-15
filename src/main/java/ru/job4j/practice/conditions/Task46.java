package ru.job4j.practice.conditions;

public class Task46 {
    public static void changeNums(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 - 1);
            System.out.println(num2 + 1);
        } else if (num1 < num2) {
            System.out.println(num1 + 1);
            System.out.println(num2 - 1);
        } else {
            System.out.println(num1 + 1);
            System.out.println(num2 + 1);
        }
    }
}
