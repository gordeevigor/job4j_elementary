package ru.job4j.practice.datatype;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        int result = num3 * 100 + num2 * 10 + num1;
        System.out.println(result);
    }
}
