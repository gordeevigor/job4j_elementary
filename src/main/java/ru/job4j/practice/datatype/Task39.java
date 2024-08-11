package ru.job4j.practice.datatype;

public class Task39 {
    public static void leftCircleShift(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        int result = num2 * 100 + num3 * 10 + num1;
        System.out.println(result);
    }
}
