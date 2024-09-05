package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        StringJoiner joiner = new StringJoiner(" ");
        int d = (a2 - a1) / (n2 - n1);
        if (n1 + 1 == n2) {
            System.out.print("Нет чисел");
        } else {
            for (int i = n1 + 1; i < n2; i++) {
                a1 += d;
                joiner.add(String.valueOf(a1));
            }
        }
        System.out.println(joiner);
    }
}
