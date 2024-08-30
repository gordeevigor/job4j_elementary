package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task46 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1000; i <= 1500; i++) {
            if (((i % 1000 / 100) * 10 + (i % 100) / 10) == num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
