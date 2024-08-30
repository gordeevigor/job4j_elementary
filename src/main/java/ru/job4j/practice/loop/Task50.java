package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner joiner = new StringJoiner(" ");
        int number = 1;
        for (int i = 1; i <= 5; i++) {
            joiner.add(String.valueOf(number));
            number += n;
        }
        System.out.println(joiner);
    }
}
