package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task133 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int temp = num;
        int i = 1;
        if (num < 1000) {
            while (temp < 1000) {
                joiner.add(String.valueOf(temp));
                i++;
                temp = (int) Math.pow(num, i);
            }
            System.out.println(joiner);
        } else {
            System.out.print("");
        }
    }
}
