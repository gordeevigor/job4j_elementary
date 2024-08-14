package ru.job4j.practice.conditions;

public class Task30 {
    public static void numModify(int number) {
        if (number < 0) {
            System.out.println(Math.abs(number));
        } else if (number > 0) {
            System.out.println(0);
        } else {
            System.out.println(number);
        }
    }
}
