package ru.job4j.practice.loop;

public class Task118 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        int temp = num;
        do {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                count++;
            } else {
                sum += digit;
            }
            temp /= 10;
        } while (temp > 0);
        System.out.println("Количество чет: " + count + ", сумма нечет: " + sum);
    }
}
