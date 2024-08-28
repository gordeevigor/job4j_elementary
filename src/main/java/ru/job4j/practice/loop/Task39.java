package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task39 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 200; i <= 210; i++) {
            if (i % ((i / 100) + (i % 100 / 10) + ((i % 10) % 10)) == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
