package ru.job4j.practice.loop;

public class Task138 {
    public static void loop() {
        for (int i = 99; i > 10; i--) {
            int num1, num2;
            num1 = i / 10;
            num2 = i % 10;
            if (i % (num1 + num2) == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}