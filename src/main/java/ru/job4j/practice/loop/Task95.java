package ru.job4j.practice.loop;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int sum = 0;
        int sumMath = 0;
        int sumInfo = 0;
        for (int i = 0; i < math.length; i++) {
            if ((math[i] + info[i]) / 2 >= 7 && math[i] > info[i]) {
               sum++;
               sumMath++;
            } else if ((math[i] + info[i]) / 2 >= 7) {
               sum++;
               sumInfo++;
            }
        }
        System.out.println("Зачислено: " + sum + ", ФМ: " + sumMath + ", ФИ: " + sumInfo);
    }
}
