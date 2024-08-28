package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task32 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 50; i >= 10; i--) {
            if (i % 10 == 7) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
