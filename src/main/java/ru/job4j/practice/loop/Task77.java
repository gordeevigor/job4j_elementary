package ru.job4j.practice.loop;

public class Task77 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
