package ru.job4j.practice.loop;

public class Task116 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        int temp = num;
        do {
            int digit = temp % 10;
            sum += digit;
            count++;
            temp /= 10;
        } while (temp > 0);
        System.out.println("Количество: " + count + ", сумма: " + sum);
    }
}
