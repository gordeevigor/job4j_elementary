package ru.job4j.practice.datatype;

public class Task29 {
    public static void numSum(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = (number % 10) % 10;
        int num = num1 + num2 + num3;
        System.out.println(num);
    }
}
