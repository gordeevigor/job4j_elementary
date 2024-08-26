package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task19 {
    public static void loop() {
        System.out.println("Старт");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 153; i++) {
            if (i % 10 == 7) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }
}
