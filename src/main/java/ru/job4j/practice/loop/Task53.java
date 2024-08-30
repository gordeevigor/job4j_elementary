package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task53 {
    public static void loop(int n) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) {
            joiner.add(String.valueOf((int) Math.pow(2, i)));
        }
        System.out.println(joiner);
    }
}
