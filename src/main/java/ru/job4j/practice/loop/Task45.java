package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task45 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 500; i++) {
            if (((i % 100 / 10) * 10) + (((i % 10) % 10)) == num || (i / 100) + (i % 100 / 10) == num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
