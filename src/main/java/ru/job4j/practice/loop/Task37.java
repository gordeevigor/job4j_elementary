package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task37 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 130; i++) {
        if ((i / 100) * ((i % 10) % 10) == Math.pow(((i % 100) / 10), 2)) {
            joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
