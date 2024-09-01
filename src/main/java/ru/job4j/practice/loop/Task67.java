package ru.job4j.practice.loop;

public class Task67 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count > 0 || num == 1 ? "Нет" : "Да");
    }
}
