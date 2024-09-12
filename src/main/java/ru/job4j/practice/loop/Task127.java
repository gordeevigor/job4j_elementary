package ru.job4j.practice.loop;

public class Task127 {
    public static void loop(int num) {
        while (num > 10) {
            int digit = num % 10;
            num /= 10;
        }
        System.out.println(num);
    }
}
