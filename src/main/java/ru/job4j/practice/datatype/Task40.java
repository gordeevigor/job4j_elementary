package ru.job4j.practice.datatype;

public class Task40 {
    public static void leftCircleShift(int number) {
        int num1, num2, num3, num4;
        num1 = number / 1000;
        num2 = number % 1000 / 100;
        num3 = (number % 100) / 10;
        num4 = (number % 10) % 10;
        int result = num2 * 1000 + num3 * 100 + num4 * 10 + num1;
        System.out.println(result);
    }
}
