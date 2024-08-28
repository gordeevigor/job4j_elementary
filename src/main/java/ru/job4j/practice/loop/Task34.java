package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int number = num % 2 == 0 ? num + 1 : num + 2;
        for (int i = 0; i < 5; i++) {
            joiner.add(String.valueOf(number));
            number += 2;
        }
        System.out.println(joiner);
    }
}
