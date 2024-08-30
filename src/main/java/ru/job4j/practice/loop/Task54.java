package ru.job4j.practice.loop;

public class Task54 {
    public static void loop(int[] array) {
        int count = 0;
        for (int arr : array) {
            if (arr > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
