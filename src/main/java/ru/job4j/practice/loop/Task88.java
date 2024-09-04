package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task88 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (3 * (i / 10 * i % 10) == i) {
                joiner.add(String.valueOf(i));
                count++;
            }
        }
        System.out.println("Числа: " + joiner + ", Количество: " + count);
    }
}
