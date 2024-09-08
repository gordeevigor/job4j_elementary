package ru.job4j.practice.loop;

public class Task107 {
    public static void loop(int[] nums) {
        int i = 0;
        while (nums[i] != 999) {
            System.out.println(nums[i]);
            i++;
        }
        System.out.println("Значений: " + i);
    }
}
