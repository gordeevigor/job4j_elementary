package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task87 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 70; i++) {
            if (Math.pow(((i / 10) + (i % 10)), 3) == Math.pow(i, 2)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
