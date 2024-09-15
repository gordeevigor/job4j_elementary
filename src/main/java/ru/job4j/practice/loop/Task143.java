package ru.job4j.practice.loop;

public class Task143 {
    public static void loop(int num1, int num2) {
        for (int i = Math.min(num1, num2); i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
