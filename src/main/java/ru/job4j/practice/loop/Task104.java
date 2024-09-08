package ru.job4j.practice.loop;

public class Task104 {
    public static void loop(int[] num) {
        int index = 0;
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
