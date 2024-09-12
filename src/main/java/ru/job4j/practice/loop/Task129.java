package ru.job4j.practice.loop;

public class Task129 {
    public static void loop(int num) {
        int sum = 0;
        int temp = num;
        do {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        } while (temp > 0);
        System.out.println(sum);
    }
}
