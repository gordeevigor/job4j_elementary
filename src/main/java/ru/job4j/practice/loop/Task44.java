package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task44 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 1000; i++) {
            if ((Math.sqrt(i * reverse(i)) % 1 == 0) && ((i / 100) != ((i % 10) % 10)) && (i % 100 != 0)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static int reverse(int num) {
        return ((((num % 10) % 10) * 100) + (((num % 100 / 10) * 10)) + (num / 100));
    }
}
