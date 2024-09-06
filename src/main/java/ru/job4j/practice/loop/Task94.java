package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task94 {
    public static void loop(int[] diameter, int[] weight) {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < diameter.length; i++) {
            if (diameter[i] <= 26 && diameter[i] >= 22 && weight[i] <= 77 && weight[i] >= 71) {
                joiner.add("Да");
            } else {
                joiner.add("Нет");
            }
        }
        System.out.println(joiner);
    }
}
