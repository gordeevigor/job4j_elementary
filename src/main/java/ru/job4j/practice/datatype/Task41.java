package ru.job4j.practice.datatype;

public class Task41 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        int result = num3 * 100 + num1 * 10 + num2;
        System.out.println(result);
    }
}
