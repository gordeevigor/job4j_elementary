package ru.job4j.practice.loop;

public class Task79 {
    public static void loop(int[] grades) {
        int bad = 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
            if (grade <= 2) {
                bad++;
            }
        }
        System.out.println("Средняя оценка: " + (double) sum / grades.length + ", неуд. оценка: " + bad);
    }
}
