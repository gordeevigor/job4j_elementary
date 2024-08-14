package ru.job4j.practice.conditions;

public class Task14 {
    public static void evenAmount(int number) {
        int num1, num2, counter = 0;
        num1 = number / 10;
        num2 = number % 10;
        counter = 2 - num1 % 2 - num2 % 2;
        System.out.println(counter);
    }
}
