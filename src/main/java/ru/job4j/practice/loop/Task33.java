package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task33 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 160; i++) {
            if (i % 11 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
