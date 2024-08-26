package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = a; i < b; i++) {
            if (i >= 10 && i <= 99) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }
}
