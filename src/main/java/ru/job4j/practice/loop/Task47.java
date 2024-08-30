package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1345; i <= 1445; i++) {
            if (firstNumbers(i) == 5 && secondNumbers(i) == 5) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static int firstNumbers(int num) {
        return num / 1000 + num % 1000 / 100;
    }

    public static int secondNumbers(int num) {
        return (num % 100 / 10) + (num % 10) % 10;
    }
}
