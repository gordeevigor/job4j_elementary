package ru.job4j.practice.loop;

import java.util.Locale;

public class Task149 {
    public static void loop(int[] grades) {
        int sum = 0;
        int count = 0;
        for (int grade : grades) {
            if (grade <= 5 && grade >= 1) {
                count++;
                sum += grade;
            } else {
                break;
            }
        }
        double avg = (double) sum / count;
        System.out.printf(Locale.ENGLISH, "%.2f%n", avg);
    }
}
