package ru.job4j.practice.loop;

public class Task80 {
    public static void loop(int[] grades) {
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int grade : grades) {
            if (grade > 2) {
                good++;
                sumGood += grade;
            }
            if (grade <= 2) {
                bad++;
                sumBad += grade;
            }
        }
        double goodAvg = sumGood != 0 ? (double) sumGood / good : 0;
        double badAvg = sumBad != 0 ? (double) sumBad / bad : 0;
        System.out.println("Средняя удовл. оценка: " + goodAvg + ", средняя неуд. оценка: " + badAvg);
    }
}
