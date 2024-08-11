package ru.job4j.practice.datatype;

public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int num11, num12, num13, num21, num22, num23;
        num11 = number1 / 100;
        num12 = number1 % 100 / 10;
        num13 = (number1 % 10) % 10;
        num21 = number2 / 100;
        num22 = number2 % 100 / 10;
        num23 = (number2 % 10) % 10;
        int result1 = num11 * 100 + num12 * 10 + num23;
        int result2 = num21 * 100 + num22 * 10 + num13;
        System.out.println(result1);
        System.out.println(result2);
    }
}
