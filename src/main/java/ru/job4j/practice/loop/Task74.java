package ru.job4j.practice.loop;

public class Task74 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum % 2 == 0 && num % 2 == 0 ? "Да" : "Нет");
    }
}
