package ru.job4j.practice.loop;

public class Task56 {
    public static void loop(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j > array[0]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
