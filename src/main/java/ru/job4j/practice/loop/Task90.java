package ru.job4j.practice.loop;

import java.util.StringJoiner;

public class Task90 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            int num1 = i / 10;
            int num2 = i % 10;
            if (2 * (num1 + num2) == num1 * num2) {
                joiner.add(String.valueOf(i));
                count++;
                sum += i;
            }
        }
        System.out.println("Числа: " + joiner + ", Количество: " + count + ", Сумма: " + sum);
    }
}
