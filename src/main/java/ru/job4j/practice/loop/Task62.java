package ru.job4j.practice.loop;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 3) {
                count++;
            }
        }
        System.out.println(count > grades.length / 2 ? "Да" : "Нет");
    }
}
