package ru.job4j.practice.loop;

public class Task98 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        int avg = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
            avg = (min + max) / 2;
        }
        System.out.println(avg);
    }
}
