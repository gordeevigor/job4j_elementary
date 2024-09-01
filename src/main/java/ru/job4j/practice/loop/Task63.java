package ru.job4j.practice.loop;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        for (int answer : answers) {
            if (answer == 1) {
                count++;
            }
        }
        System.out.println(count + ", " + (answers.length / 2 >= count ? "Нет" : "Да"));
    }
}
