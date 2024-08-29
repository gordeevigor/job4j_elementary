package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task41 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 20; i <= 35; i++) {
            if ((i / 10) % 3 == (i % 10) % 3) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
