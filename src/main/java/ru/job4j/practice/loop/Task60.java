package ru.job4j.practice.loop;

public class Task60 {
    public static void loop() {
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            if (Math.abs(i / 10 - i % 10) <= 3) {
                count++;
            }
        }
        System.out.println(count);
    }
}
