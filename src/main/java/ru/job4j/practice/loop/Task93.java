package ru.job4j.practice.loop;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int inFinal = 0;
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] + second[i] >= 80) {
                inFinal++;
                sum += first[i] + second[i];
            }
        }
        System.out.println("В финале: " + inFinal + ", сумма баллов: " + sum);
    }
}
