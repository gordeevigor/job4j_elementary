package ru.job4j.practice.loop;

public class Task137 {
    public static int sumOfNumber(int num) {
        int firstSum = 0;
        int temp = num;
        do {
            int digit = temp % 10;
            firstSum += digit;
            temp /= 10;
        } while (temp > 0);
        return firstSum;
    }

    public static void loop(int num) {
        int index = 10;
        while (num != sumOfNumber(index)) {
            index++;
        }
        System.out.println(index);
    }
}
