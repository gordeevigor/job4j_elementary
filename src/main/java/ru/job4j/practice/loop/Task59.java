package ru.job4j.practice.loop;

public class Task59 {
    public static void loop(int num, int[] array) {
        int count = 0;
        int lower = 0;
        for (int j : array) {
            if (j == num) {
                count++;
            }
            if (j < num) {
                lower++;
            }
        }
        System.out.println("Равно: " + count + ", меньше: " + lower);
    }
}
