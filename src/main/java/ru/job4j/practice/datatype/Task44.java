package ru.job4j.practice.datatype;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int lastNumber1, lastNumber2, firstNumbers1, firstNumbers2;
        firstNumbers1 = number1 / 10;
        firstNumbers2 = number2 / 10;
        lastNumber1 = number1 % 10;
        lastNumber2 = number2 % 10;
        int result1 = firstNumbers1 * 10 + lastNumber2;
        int result2 = firstNumbers2 * 10 + lastNumber1;
        System.out.println(result1);
        System.out.println(result2);
    }
}
