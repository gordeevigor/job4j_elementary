package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task28 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 30; i++) {
            if (i / 10 + i % 10 == num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
