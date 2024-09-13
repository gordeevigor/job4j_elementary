package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task135 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner("");
        int temp = num % 10 == 0 ? num / 10 : num;
        do {
            int digit = temp % 10;
            joiner.add(String.valueOf(digit));
            temp /= 10;
        } while (temp > 0);
        System.out.println(joiner);
    }
}
