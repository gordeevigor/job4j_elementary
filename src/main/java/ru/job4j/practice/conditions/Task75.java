package ru.job4j.practice.conditions;

public class Task75 {
    public static void sameNumAmount(int num) {
        int num1, num2, num3;
        int count = 0;
        num1 = num / 100;
        num2 = num % 100 / 10;
        num3 = (num % 10) % 10;
        if (num1 == num2) {
            count++;
        }
        if (num1 == num3) {
            count++;
        }
        if (num2 == num3 && num1 != num2) {
            count++;
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(count + 1);
        }
    }
}
