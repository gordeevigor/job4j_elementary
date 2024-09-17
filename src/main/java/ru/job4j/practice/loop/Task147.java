package ru.job4j.practice.loop;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int countYes = 0;
        int countNo = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (num > 0 && num >= tickets[i]) {
                num -= tickets[i];
                countYes++;
            } else {
                countNo++;
            }
        }
        System.out.println("Покупатели: " + countYes + ", отказано: " + countNo);
    }
}
