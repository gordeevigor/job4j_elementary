package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task49 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner("+");
        for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
