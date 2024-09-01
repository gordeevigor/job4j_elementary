package ru.job4j.practice.loop;

public class Task65 {
    public static void loop(int[] nums) {
        int positive = 0;
        int negative = 0;
        for (int num : nums) {
            if (num > 0) {
                positive++;
            }
            if (num < 0) {
                negative++;
            }
        }
        System.out.println(positive == negative ? "Да" : "Нет");
    }
}
