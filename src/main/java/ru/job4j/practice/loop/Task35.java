package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < 5; i++) {
            num -= 6;
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }
}
