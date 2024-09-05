package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task89 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int num1, num2, num3;
            num1 = i / 100;
            num2 = i % 100 / 10;
            num3 = (i % 10) % 10;
            if (Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3) == i) {
                joiner.add(String.valueOf(i));
                count++;
            }
        }
        System.out.println("Числа: " + joiner + ", Количество: " + count);
    }
}
