package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int number = 7;
        for (int i = 1; i <= num; i++) {
           joiner.add(String.valueOf(number));
           number += 4;
        }
        System.out.println(joiner);
    }
}
