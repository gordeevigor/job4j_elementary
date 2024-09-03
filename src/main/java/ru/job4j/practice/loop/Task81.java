package ru.job4j.practice.loop;

public class Task81 {
    public static void loop(int num) {
        int num1 = num / 10;
        int num2 = num % 10;
        int sum = 0;
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
