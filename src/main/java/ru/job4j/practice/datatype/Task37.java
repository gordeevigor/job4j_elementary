package ru.job4j.practice.datatype;

public class Task37 {
    public static void leftShift(int number) {
        int num2, num3;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        int result = num2 * 100 + num3 * 10;
        System.out.println(result);
    }
}
