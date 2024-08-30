package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
            joiner.add(i % 2 == 0 ? "0" : String.valueOf((int) Math.pow(i, 2)));
        }
        System.out.println(joiner);
    }
}
