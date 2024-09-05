package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        StringJoiner joiner = new StringJoiner(" ");
        int num = n3 + (n3 - n2);
        if (n3 - n2 == n2 - n1) {
            for (int i = 0; i < 3; i++) {
                joiner.add(String.valueOf(num));
                num += (n3 - n2);
            }
        } else {
            System.out.print("Нет");
        }
        System.out.println(joiner);
    }
}
