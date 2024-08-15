package ru.job4j.practice.conditions;

public class Task13 {
    public static void evenAmount(int number) {
        int num1, num2, num3, counter = 0;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        counter = 3 - num1 % 2 - num2 % 2 - num3 % 2;
        System.out.println(counter);
    }
}
