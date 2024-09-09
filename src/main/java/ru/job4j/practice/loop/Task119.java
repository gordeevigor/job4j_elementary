package ru.job4j.practice.loop;

public class Task119 {
    public static void loop(int num, int digit) {
        int count = 0;
        int temp = num;
        do {
            int point = temp % 10;
            if (point == digit) {
                count++;
            }
            temp /= 10;
        } while (temp > 0);
        System.out.println(count > 0 ? "Да" : "Нет");
    }
}
