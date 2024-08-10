package ru.job4j.practice.datatype;

public class Task30 {
    public static void difference(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        int num = num1 - num2;
        System.out.println(Math.abs(num));
    }
}
