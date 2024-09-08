package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task111 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 0;
        int number = num + 1;
        while (Math.pow(num, 2) > sum + number) {
            sum += number;
            joiner.add(String.valueOf(number));
            number++;
        }
        System.out.println(joiner);
    }
}
