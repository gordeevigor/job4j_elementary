package ru.job4j.practice.loop;

public class Task153 {
    public static void loop() {
        int money = 100;
        int bullprice = 10;
        int cowprice = 5;
        for (int i = 0; i <= money / bullprice; i++) {
            int cow = (money - bullprice * i) / cowprice;
            System.out.println("Быков: " + i + ", коров: " + cow);
        }
    }
}
