package ru.job4j.practice.conditions;

public class Task45 {
    public static void changeToRoundNum(int number) {
        if (number % 10 == 0) {
            System.out.println("Без изменений");
        } else if (number % 2 == 0) {
            number = number - number % 10 + 10;
            System.out.println("Увеличено до " + number);
        } else {
            number -= number % 10;
            System.out.println("Уменьшено до " + number);
        }
    }
}
