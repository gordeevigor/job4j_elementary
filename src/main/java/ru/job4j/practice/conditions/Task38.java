package ru.job4j.practice.conditions;

public class Task38 {
    public static void maxDigit(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num1 != num2 ? Math.max(num1, num2) : "Равны");
    }
}
