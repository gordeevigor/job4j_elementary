package ru.job4j.practice.loop;

public class OddCount {
    public static int count(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
