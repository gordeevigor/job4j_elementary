package ru.job4j.practice.loop;

public class TaskVariant63 {
    public static void loop(int[] answers) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        System.out.println(Math.max(count0, count1) + ", " + (count1 > count0 ? "Да" : "Нет"));
    }
}
