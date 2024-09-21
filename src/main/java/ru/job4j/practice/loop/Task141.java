package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task141 {
    public static void loop(int x, int y) {
        StringJoiner joiner = new StringJoiner(" ");
        int newnumber = Math.max(x, y) % 2 == 0 ? Math.max(x, y) / 2 : Math.max(x, y) - 1;
        int count = 0;
        while (newnumber > Math.min(x, y)) {
            joiner.add(String.valueOf(newnumber));
            count++;
            newnumber = newnumber % 2 == 0 ? newnumber / 2 : newnumber - 1;
        }
        if (count == 0) {
            System.out.println("Числа: 0, Количество: 0");
        } else {
            System.out.println("Числа: " + joiner + ", Количество: " + count);
        }
    }
}
