package ru.job4j.practice.loop;

public class Task142 {
    public static void loop(int num) {
        if (num <= 0) {
            System.out.println("Да");
            return;
        }
        int[] fibonachi = new int[Math.max(num, 5)];
        fibonachi[0] = 0;
        fibonachi[1] = 1;
        fibonachi[2] = 1;
        fibonachi[3] = 2;
        fibonachi[4] = 3;
        for (int i = 5; i < fibonachi.length; i++) {
            fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
        }
        boolean found = false;
        for (int f : fibonachi) {
            if (f == num) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Да" : "Нет");
    }
}
