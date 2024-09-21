package ru.job4j.practice.loop;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int yes = 0;
        int no = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (num > 0 && num >= tickets[i]) {
                num -= tickets[i];
                yes++;
            } else {
                no++;
            }
        }
        System.out.println("Покупатели: " + yes + ", отказано: " + no);
    }
}
