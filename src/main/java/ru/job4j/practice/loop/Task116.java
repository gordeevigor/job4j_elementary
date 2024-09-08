package ru.job4j.practice.loop;

public class Task116 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num / 10 > 0) {
           count++;
           num = num % 10;
           sum += num % 10;
        }
        System.out.println("Количество: " + count + ", сумма: " + sum);
    }
}
