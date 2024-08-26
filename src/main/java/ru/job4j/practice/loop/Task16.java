package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task16 {
    public static void loop() {
        System.out.println("Старт");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i <= 9; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }
}
