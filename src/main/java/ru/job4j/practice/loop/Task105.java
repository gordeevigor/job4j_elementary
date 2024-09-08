package ru.job4j.practice.loop;

public class Task105 {
    public static void loop(int[] num) {
        int max = 0;
        int maxSum = (num[0] / 100) + (num[0] % 100 / 10) + ((num[0] % 10) % 10);
        for (int i = 1; i < num.length; i++) {
            if ((num[i] / 100) + (num[i] % 100 / 10) + ((num[i] % 10) % 10) > maxSum) {
                maxSum = (num[i] / 100) + (num[i] % 100 / 10) + ((num[i] % 10) % 10);
                max = i;
            }
        }
        System.out.println(max);
    }
}
