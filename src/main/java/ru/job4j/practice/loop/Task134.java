package ru.job4j.practice.loop;

public class Task134 {
    public static void loop(int num) {
        int sum = 0;
        int i = 1;
        while (sum + i * i <= num) {
            sum += (int) Math.pow(i, 2);
            i++;
        }
        System.out.println(sum);
    }
}
