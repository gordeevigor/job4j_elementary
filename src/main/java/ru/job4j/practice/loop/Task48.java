package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task48 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner("+");
        for (int i = 1; i <= num; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
