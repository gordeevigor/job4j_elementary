package ru.job4j.practice.loop;

public class Task96 {
    public static void loop(int[] num) {
        int min = num[0];
        for (int j : num) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}
