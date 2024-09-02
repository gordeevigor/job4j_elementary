package ru.job4j.practice.loop;

public class Task79 {
    public static void loop(int[] grades) {
        int bad = 0;
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (grades[i] <= 2) {
                bad++;
            }
        }
        System.out.println("Средняя оценка: " + (double) sum / grades.length + ", неуд. оценка: " + bad);
    }
}
