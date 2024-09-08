package ru.job4j.practice.loop;

public class Task115 {
    public static void loop(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                sum += nums[i];
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
