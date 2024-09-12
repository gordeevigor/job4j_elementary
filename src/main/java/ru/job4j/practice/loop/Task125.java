package ru.job4j.practice.loop;

import java.util.Arrays;
import java.util.StringJoiner;

public class Task125 {
    public static void loop(int num) {
        StringBuilder evenDigits = new StringBuilder();
        StringBuilder oddDigits = new StringBuilder();
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenDigits.insert(0, digit + " ");
            } else {
                oddDigits.insert(0, digit + " ");
            }
            num /= 10; // Убираем последнюю цифру
        }
        if (evenDigits.length() > 0) {
            System.out.println(evenDigits.toString().trim());
        }
        if (oddDigits.length() > 0) {
            System.out.println(oddDigits.toString().trim());
        }
    }

    public static int digitCounter(int num) {
        int temp = num;
        int count = 0;
        do {
            count++;
            temp /= 10;
        } while (temp > 0);
        return count;
    }
}
