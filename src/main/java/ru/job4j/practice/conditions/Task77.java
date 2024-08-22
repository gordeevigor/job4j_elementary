package ru.job4j.practice.conditions;

public class Task77 {
    public static void diffNumAmount(int num) {
        int num1, num2, num3;
        int count = 0;
        num1 = num / 100;
        num2 = num % 100 / 10;
        num3 = (num % 10) % 10;
        if (num1 != num2) {
            count++;
        }
        if (num1 != num3) {
            count++;
        }
        if (num2 != num3) {
            count++;
        }
        System.out.println(count);
    }
}
