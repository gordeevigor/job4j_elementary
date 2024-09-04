package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task86 {
    public static void loop(int[] num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int j : num) {
            if (((j * 2) / 10 + (j * 2) % 10) == ((j / 10 + j % 10))) {
                joiner.add(String.valueOf(j));
            } else {
                joiner.setEmptyValue("Стабильных чисел нет");
            }
        }
        System.out.println(joiner);
    }
}
