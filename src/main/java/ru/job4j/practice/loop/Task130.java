package ru.job4j.practice.loop;

public class Task130 {
    public static void loop(int num) {
        int count = 0;
        int temp = num;
        do {
            int digit = temp % 10;
            if (digit == 0) {
                count++;
            }
            temp /= 10;
        } while (temp > 0);
        System.out.println(count);
    }
}