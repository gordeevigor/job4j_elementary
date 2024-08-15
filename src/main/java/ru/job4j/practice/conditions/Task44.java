package ru.job4j.practice.conditions;

public class Task44 {
    public static void getRoundNumber(int number) {
        int excess = number % 10;
        System.out.println(excess < 5 ? number - excess : number - excess + 10);
    }
}
