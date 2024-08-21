package ru.job4j.practice.conditions;

public class Task71 {
    public static void change(int money) {
        int coin100, coin50, coin10, change;
        coin100 = money / 100;
        coin50 = (money - coin100 * 100) / 50;
        coin10 = (money - coin100 * 100 - coin50 * 50) / 10;
        change = (money - coin100 * 100 - coin50 * 50) % 10;
        System.out.println(change == 0 ? "100: " + coin100 + ", 50: " + coin50 + ", 10: " + coin10 : "Нельзя");
    }
}
