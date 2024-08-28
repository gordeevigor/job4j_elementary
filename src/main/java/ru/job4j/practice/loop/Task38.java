package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 200; i <= 223; i++) {
            if ((i % 100 / 10) % 2 == 0 && ((i % 10) % 10) % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
