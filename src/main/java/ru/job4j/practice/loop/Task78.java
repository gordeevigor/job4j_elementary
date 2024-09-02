package ru.job4j.practice.loop;

public class Task78 {
    public static void loop(int[] days, int[] values) {
        int x = 0;
        int y = 0;
        for (int value : values) {
            if (value >= 7) {
                x++;
            }
        }
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[j] <= 5 && i == j && days[i] == 2) {
                    y++;
                }
            }
        }
        System.out.println("Опасно: " + x + ", спокойный вторник: " + y);
    }
}
