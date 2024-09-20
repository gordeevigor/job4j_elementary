package ru.job4j.practice.loop;

public class Task153 {
    public static void loop() {
        int money = 100;
        int bullPrice = 10;
        int cowPrice = 5;
        for (int i = 0; i <= money / bullPrice; i++) {
            int cow = (money - bullPrice * i) / cowPrice;
            System.out.println("Быков: " + i + ", коров: " + cow);
        }
    }
}
