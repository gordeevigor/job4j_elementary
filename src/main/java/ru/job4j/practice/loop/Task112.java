package ru.job4j.practice.loop;

public class Task112 {
    public static void loop(int num, int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num > 0) {
                num -= nums[i];
                if (num > 0) {
                    count++;
                }
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
