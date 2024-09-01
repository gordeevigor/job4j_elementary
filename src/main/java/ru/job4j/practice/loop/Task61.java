package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task61 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 500; i++) {
            if (((int) Math.pow(i / 100, 2) + (int) Math.pow((i % 10) % 10, 2)) == (int) Math.pow((i % 100 / 10), 2)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
