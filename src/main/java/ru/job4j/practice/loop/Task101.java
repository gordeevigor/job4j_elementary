package ru.job4j.practice.loop;

public class Task101 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Max: " + max + ", min: " + min);
    }
}
