package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task151 {
    public static void loop() {
        for (int i = 1; i < 10; i++) {
            StringJoiner joiner = new StringJoiner(" ");
            for (int j = 1; j < 10; j++) {
                joiner.add(String.valueOf(i * j));
            }
            System.out.println(joiner);
        }
    }
}
