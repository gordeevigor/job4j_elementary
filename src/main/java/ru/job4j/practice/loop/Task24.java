package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task24 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 5;
        int beginNum = num - 10;
        while (count > 0) {
            if (count == 5) {
                joiner.add(String.valueOf(beginNum));
            } else {
                beginNum = beginNum - 6;
                joiner.add(String.valueOf(beginNum));
            }
            count--;
        }
        System.out.println(joiner);
    }
}
