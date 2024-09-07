package ru.job4j.practice.loop;

public class Task100 {
    public static void loop(int[] num) {
        int maxNum = num[0];
        int maxSum = (num[0] / 10) + (num[0] % 10);
        for (int i = 1; i < num.length; i++) {
            if (((num[i] / 10) + (num[i] % 10)) > maxSum) {
                maxNum = num[i];
                maxSum = ((num[i] / 10) + (num[i] % 10));
            }
        }
        System.out.println(maxNum);
    }
}
