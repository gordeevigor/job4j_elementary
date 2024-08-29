package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task42 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 20; i <= 30; i++) {
            if ((i / 10) % 3 != (i % 10) % 3) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
