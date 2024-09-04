package ru.job4j.practice.loop;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = money;
        for (int i = 1; i <= months; i++) {
            sum += ((sum * percent) / 100);
        }
        System.out.printf("%.2f%n", sum);
    }
}
