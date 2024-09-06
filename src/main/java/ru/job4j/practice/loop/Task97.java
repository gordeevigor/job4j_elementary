package ru.job4j.practice.loop;

public class Task97 {
    public static void loop(int[] num) {
        int bestTime = 100000;
        int number = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < bestTime) {
                bestTime = num[i];
                number = i;
            }
        }
        System.out.println("Время: " + bestTime + ", номер: " + number);
    }
}
