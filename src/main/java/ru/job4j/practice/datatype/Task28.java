package ru.job4j.practice.datatype;

public class Task28 {
    public static void numSum(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        int num = num1 + num2;
        System.out.println(num);
    }
}
