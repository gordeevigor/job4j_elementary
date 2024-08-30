package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner(" ");
        if (n < m) {
            for (int i = 1; i <= n; i++) {
                joiner.add(String.valueOf(m));
                m++;
            } 
        } else {
            for (int i = 1; i <= m; i++) {
                joiner.add(String.valueOf(n));
                n++;
            }
        }
        System.out.println(joiner);
    }
}
