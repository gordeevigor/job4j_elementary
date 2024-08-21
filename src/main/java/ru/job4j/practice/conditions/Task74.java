package ru.job4j.practice.conditions;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        int check12, check23, check34;
        check12 = (num4 / 1000) * 10 + num4 % 1000 / 100;
        check23 = (num4 % 1000 / 100) * 10 + (num4 % 100) / 10;
        check34 = ((num4 % 100) / 10) * 10 + (num4 % 10) % 10;
        System.out.println(num2 == check12 || num2 == check23 || num2 == check34 ? "Да" : "Нет");
    }
}
