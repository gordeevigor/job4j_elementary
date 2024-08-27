package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task27 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = -num + 1; i < num; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
