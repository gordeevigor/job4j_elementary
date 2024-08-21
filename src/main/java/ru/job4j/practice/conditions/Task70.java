package ru.job4j.practice.conditions;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        if (seconds <= 3600) {
            System.out.println("Минут: " + seconds / 60 + ", секунд: " + seconds % 60);
        } else {
            System.out.println("Расчет не производится");
        }
    }
}
