package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task21 {
    public static void loop() {
        System.out.println("Старт");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 38; i >= 10; i--) {
            if (i % 5 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }
}
