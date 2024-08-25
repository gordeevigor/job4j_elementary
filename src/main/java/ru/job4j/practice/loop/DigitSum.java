package ru.job4j.practice.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
