package ru.job4j.practice.loop;

public class Task128 {
    public static void loop(int num) {
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num > 0);
        System.out.println(count);
    }
}
