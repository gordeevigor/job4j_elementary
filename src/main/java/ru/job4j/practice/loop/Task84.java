package ru.job4j.practice.loop;

public class Task84 {
    public static void loop(int a1, int a2, int num) {
        int[] fibonachi = new int[num];
        fibonachi[0] = a1;
        fibonachi[1] = a2;
        int sum = 0;
        for (int i = 2; i < fibonachi.length; i++) {
            fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
        }
        for (int j : fibonachi) {
            sum += j;
        }
        System.out.println(sum);
    }
}
