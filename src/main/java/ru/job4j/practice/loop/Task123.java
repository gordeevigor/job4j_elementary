package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task123 {
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
        StringJoiner joiner = new StringJoiner(" ");
        if (sumOfNumber(num) >= 10 && sumOfNumber(num) != 5) {
            do {
                joiner.add(String.valueOf(sumOfNumber(num)));
                num = sumOfNumber(num);
            }
            while (num >= 10);
            System.out.println(joiner);
        } else if (sumOfNumber(num) == 5) {
            System.out.println(5);
        } else {
            System.out.println();
        }
    }
}
