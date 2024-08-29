package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 300; i <= 325; i++) {
            if (((((i % 100 / 10)) * 10 + (i % 10) % 10)) >= 10 && ((((i % 100 / 10)) * 10 + (i % 10) % 10)) % (i / 100) == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
