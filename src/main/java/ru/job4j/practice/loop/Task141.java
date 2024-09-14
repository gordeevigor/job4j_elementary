package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task141 {
    public static void loop(int x, int y) {
        StringJoiner joiner = new StringJoiner("");
        int newNumber = Math.max(x, y) % 2 == 0 ? Math.max(x, y) / 2 : Math.max(x, y) - 1;
        //while ()
        System.out.println(newNumber);
        System.out.println("Числа: 26 13 12 6, Количество: 4");
    }
}
