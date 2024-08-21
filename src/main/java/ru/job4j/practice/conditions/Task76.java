package ru.job4j.practice.conditions;

public class Task76 {
    public static void innerNum(int num2, int num4) {
        int check12, check23, check34;
        int count = 0;
        check12 = (num4 / 1000) * 10 + num4 % 1000 / 100;
        check23 = (num4 % 1000 / 100) * 10 + (num4 % 100) / 10;
        check34 = ((num4 % 100) / 10) * 10 + (num4 % 10) % 10;
        if (check12 == num2) {
            count++;
        }
        if (check23 == num2) {
            count++;
        }
        if (check34 == num2) {
            count++;
        }
        System.out.println(count);
    }
}
