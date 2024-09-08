package ru.job4j.practice.loop;

public class Task109 {
    public static void loop(int[] nums) {
        int i = 0;
        while (nums[i] != 123) {
            System.out.println("Код не принят");
            i++;
        }
        System.out.println("Код принят");
    }
}
