package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task36 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 30; i++) {
            if ((i / 10) * (i % 10) >= 10) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
