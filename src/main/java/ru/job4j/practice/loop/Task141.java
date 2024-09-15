package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task141 {
    public static void loop(int x, int y) {
        StringJoiner joiner = new StringJoiner(" ");
        int newNumber = Math.max(x, y) % 2 == 0 ? Math.max(x, y) / 2 : Math.max(x, y) - 1;
        int count = 0;
        while (newNumber > Math.min(x, y)) {
            joiner.add(String.valueOf(newNumber));
            count++;
            newNumber = newNumber % 2 == 0 ? newNumber / 2 : newNumber - 1;
        }
        if (count == 0) {
            System.out.println("Числа: 0, Количество: 0");
        } else {
            System.out.println("Числа: " + joiner + ", Количество: " + count);
        }
    }
}
