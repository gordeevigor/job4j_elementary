package ru.job4j.practice.datatype;

public class Task36 {
    public static void firstLastChange(int number) {
        int first, middle, last;
        int num1 = number / 1000;
        int num2 = number % 1000 / 100;
        int num3 = (number % 100) / 10;
        int num4 = (number % 10) % 10;
        first = num1;
        last = num4;
        System.out.println(last * 1000 + num2 * 100 + num3 * 10 + first);
    }
}
