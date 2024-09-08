package ru.job4j.practice.loop;

public class Task108 {
    public static void loop(int[] nums) {
        int i = 0;
        int sum = 0;
        while (nums[i] != 999) {
            System.out.println(nums[i]);
            sum += nums[i];
            i++;
        }
        System.out.println("Сумма: " + sum);
    }
}
