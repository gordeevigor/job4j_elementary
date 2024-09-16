package ru.job4j.practice.loop;

import java.util.Locale;
import java.util.StringJoiner;

public class Task145 {
    public static void loop(int num1, double num2) {
        StringJoiner joiner = new StringJoiner(" ");
        double current = num1;
        int count = 0;
        while (current > 1 + num2 + Math.sqrt(current)) {
            current = Math.sqrt(current);
            joiner.add(String.format(Locale.ENGLISH, "%.1f", current));
            count++;
        }
        System.out.println("Промежуточные: " + joiner + ", Количество: " + count);
    }
}
