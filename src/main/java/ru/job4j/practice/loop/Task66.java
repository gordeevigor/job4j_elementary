package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task66 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println("Количество: " + count + ", Делители: " + (count == 0 ? joiner.setEmptyValue("0") : joiner));
    }
}
