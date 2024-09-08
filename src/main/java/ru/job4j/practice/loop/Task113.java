package ru.job4j.practice.loop;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < first.length; i++) {
           if (first[i] != second[i]) {
               x += first[i];
               y += second[i];
           } else {
               break;
           }
        }
        System.out.println("Сумма1: " + x + ", сумма2: " + y);
    }
}
