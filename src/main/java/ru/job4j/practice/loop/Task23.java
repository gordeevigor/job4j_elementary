package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = num + 1; i <= num + 5; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
