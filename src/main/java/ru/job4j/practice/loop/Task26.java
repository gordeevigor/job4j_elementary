package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int number = 0;
        for (int i = 1; i <= num * 2; i++) {
            joiner.add(String.valueOf(number));
            number -= 8;
        }
        System.out.println(joiner);
    }
}
