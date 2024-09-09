package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task120 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int temp = num;
        do {
            temp /= 10;
            joiner.add(String.valueOf(temp));
        } while (temp > 0);
        System.out.println(joiner);
    }
}
