package ru.job4j.practice.loop;

public class Task103 {
    public static void loop(int[] num) {
        int min = num[0];
        int minSum = (num[0] / 100) + (num[0] % 100 / 10) + ((num[0] % 10) % 10);
        for (int i = 1; i < num.length; i++) {
            if ((num[i] / 100) + (num[i] % 100 / 10) + ((num[i] % 10) % 10) < minSum) {
                minSum = (num[i] / 100) + (num[i] % 100 / 10) + ((num[i] % 10) % 10);
                min = num[i];
            }
        }
        System.out.println(min);
    }
}
