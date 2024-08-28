package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 130; i++) {
            if ((i % 10) % 10 == num % 10) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
